package hello.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	// ログイン画面を表示させる
	@GetMapping("/login")
	public String getLoginPage() {
		return "login.html";
	}

	// 登録画面(register.html)を表示させる
	// URL 「/register」
	// メソッド名 「getRegisterPage」
	@GetMapping("/register")
	public String getRegisterPage() {
		return "register.html";
	}

	// 成功画面(success.html)を表示させる
	// URL 「/result」
	// メソッド名 「getResultPage」
	@GetMapping("/result")
	public String getResultPage() {
		return "success.html";
	}

	// ログイン画面から送信されたデータを受け取る
	@PostMapping("/login/process")
	public String login(@RequestParam String email, @RequestParam String password) {
		// 確認用
		System.out.println(email);
		System.out.println(password);

		// もし、emailの内容が「admin@test.com」
		// かつ、ｐasswordの内容が「admin」と等しい場合は/resultに転送（リダイレクト）
		// そうではない場合、ログイン画面/loginに転送（リダイレクト）
		if (email.equals("admin@test.com") && password.equals("admin")) {
			return "redirect:/result";
		} else {
			return "redirect:/login";
		}
	}

	/**
	 * htmlからデータを受け取るためのURL「/register/process」 メソッド名：register
	 * 
	 * もし、usernameの内容が「user」 かつ、emailの内容が「admin@test.com」
	 * かつ、passwordの内容が「admin」の場合、/resultに転送してください そうでない場合、/registerに転送してください
	 */
	@PostMapping("/register/process")
	public String register(@RequestParam String username, @RequestParam String email, @RequestParam String password) {
		if(username.equals("user") && email.equals("admin@test.com")
				&& password.equals("admin")) {
			return "redirect:/result";
		} else {
			return "redirect:/register";
		}
	}

	
	
	
	
	
	
}
