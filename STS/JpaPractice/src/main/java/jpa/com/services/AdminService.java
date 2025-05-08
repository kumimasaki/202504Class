package jpa.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpa.com.models.dao.AdminDao;
import jpa.com.models.entity.Admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	// もし、adminEmailが既に存在していた場合、エラーメッセージを出して登録処理をしないようにする
	// そうでない場合、登録処理を行ってログイン画面を表示する
	// 登録処理が成功：true, 失敗：false
	public boolean createAdmin(String adminEmail, String adminName, String password) {
		if(adminDao.findByAdminEmail(adminEmail) != null) {
			return false;
		} else {
			// 登録処理
			adminDao.save(new Admin(adminEmail, adminName, password));
			return true;
		}
	}
	
	// ログインチェック用のメソッド　メソッド名「loginCheck」
	public boolean loginCheck(String adminEmail, String password) {
		// もし、「emailとpasswordの組み合わせ」が存在していない場合、falseを返す
		// そうでない場合、trueを返す
		if(adminDao.findByAdminEmailAndPassword(adminEmail, password) == null) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
	
	
	
	
}
