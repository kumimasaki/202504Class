package net.lighthouseplan.spring.junit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.lighthouseplan.spring.junit.services.AccountService;


@Controller
public class ReigisterController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/register")
	public String getRegisterPage() {
		return "register.html";
	}
	
	@PostMapping("/register")
	public ModelAndView register(@RequestParam String username,
			@RequestParam String password, ModelAndView mav) {
		if (accountService.createAccount(username, password)) {
			mav.setViewName("login.html");
		} else {
			mav.addObject("error", true);
			mav.setViewName("register.html");
		}
		return mav;
	}
}
