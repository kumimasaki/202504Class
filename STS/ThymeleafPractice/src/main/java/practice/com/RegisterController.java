package practice.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

	// 登録画面の表示メソッド
	@GetMapping("/register")
	public String getRegisterPage() {
		return "register.html";
	}
	
	// register.htmlからデータを受け取り、success2.htmlで表示させる準備をするメソッド
	@PostMapping("/register/process")
	public String register(@RequestParam String username,
			@RequestParam String email,
			@RequestParam String password, Model model) {
		// 画面にデータを渡す
		model.addAttribute("userName", username);
		model.addAttribute("userEmail", email);
		model.addAttribute("userPassword", password);
		return "success2.html";
	}
	
	
	
	
	
	
	
	
	
	
	
}
