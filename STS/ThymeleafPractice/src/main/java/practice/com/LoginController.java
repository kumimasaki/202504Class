package practice.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	// ログイン画面を表示
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("error", false);
		return "login.html";
	}
	
	@PostMapping("/login/process")
	public String login(@RequestParam String email,
			@RequestParam String password, Model model) {
		String[] test = {"aa", "bb", "cc"};
		Cat cat = new Cat("Alice", 3);
		
		if (email.equals("test@test.com") && password.equals("admin")) {
			model.addAttribute("userEmail", email);
			model.addAttribute("userPassword", password);
			model.addAttribute("array", test);
			model.addAttribute("alice", cat);
			return "success.html";
		} else {
			model.addAttribute("error", true);
			return "login.html";
		}
	}
	
//	@PostMapping("/login/process")
//	public ModelAndView login(@RequestParam String email,
//			@RequestParam String password,
//			ModelAndView mav) {
//		mav.addObject("userEmail", email);
//		mav.addObject("userPassword", password);
//		mav.setViewName("success.html");
//		return mav;
//	}
}
