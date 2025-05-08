package jpa.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jpa.com.models.dao.AdminDao;
import jpa.com.models.entity.Admin;
import jpa.com.services.AdminService;

@Controller
public class RegisterController {
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private AdminService adminService;

	// 登録画面表示
	// 表示するためのURL：/register
	// メソッド名：getRegisterPage
	// 表示するファイルの名前：register.html
	@GetMapping("/register")
	public String getRegisterPage(Model model) {
		model.addAttribute("error", false);
		return "register.html";
	}

	@PostMapping("/register/process")
	public String registerProcess(@RequestParam String adminName, @RequestParam String adminEmail,
			@RequestParam String password, Model model) {
//		// もし、adminEmailが既に存在していた場合、エラーメッセージを出して登録処理をしないようにする
//		// そうでない場合、登録処理を行ってログイン画面を表示する
//		if (adminDao.findByAdminEmail(adminEmail) != null) {
//			model.addAttribute("error", true);
//			return "register.html";
//		} else {
//			// 登録処理
//			adminDao.save(new Admin(adminEmail, adminName, password));
//			return "login.html";
//		}
		
		if(!adminService.createAdmin(adminEmail, adminName, password)) {
			model.addAttribute("error", true);
			return "register.html";
		} else {
			return "login.html";
		}
		
	}

}
