package jpa.com.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpa.com.models.entity.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {
	// データを保存するinsert文のメソッド
	Admin save(Admin admin);
	
	// SELECT * FROM admin WHERE admin_email = ?
	Admin findByAdminEmail(String adminEmail);
	
	// SELECT * FROM admin WHERE admin_id = ?
	Admin findByAdminId(Long adminId);
	
	// SELECT * FROM admin WHERE admin_email = ? AND password=?
	Admin findByAdminEmailAndPassword(String adminEmail, String adminPassword);
	
//	List<Admin> findAll();
}
