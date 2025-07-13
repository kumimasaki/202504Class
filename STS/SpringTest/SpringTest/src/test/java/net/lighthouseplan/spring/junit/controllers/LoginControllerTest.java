package net.lighthouseplan.spring.junit.controllers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import net.lighthouseplan.spring.junit.services.AccountService;

@SpringBootTest
@AutoConfigureMockMvc
public class LoginControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private AccountService accountService;
	
	// サービスクラスを使ったデータ作成
	@BeforeEach
	public void prepareData() {
		// ログインが成功：　username "Alice"、　password "12345678"　true
		when(accountService.validateAccount("Alice", "12345678")).thenReturn(true);
		// ログインが失敗：　username "Ana"と等しい、　パスワードはどんな値でもいい　false
		when(accountService.validateAccount(eq("Ana"), any())).thenReturn(false);
	}
	
	// ログインページを正しく取得するテスト
	@Test
	public void testGetLoginPage_Succeed() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders
								.get("/login");
		
		mockMvc.perform(request)
				.andExpect(view().name("login.html"));
	}
	
	// ログインが成功した場合のテスト
	// ログインが成功したら「hello.html」に遷移して、入力された値が渡されているかのテスト
	@Test
	public void testLogin_CorrectInfo_Succeed() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders
								.post("/login")
								.param("username", "Alice")
								.param("password", "12345678");
		
		mockMvc.perform(request)
				.andExpect(model().attribute("name", "Alice"))
				.andExpect(view().name("hello.html"));
	}
	
	// ログインが失敗した場合のテスト
	@Test
	public void testLogin_IncorrectInfo_Fail() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders
								.post("/login")
								.param("username", "Ana")
								.param("password", "1234");

		mockMvc.perform(request)
				.andExpect(model().attribute("error", true))
				.andExpect(view().name("login.html"));		
	}

}
