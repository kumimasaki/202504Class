package lesson2_3.capsule.singleton;

public class Company {
	// メンバ変数
	// 社員ID
	private int userID;
	// パスワード
	private String password;
	
	// この設計書で唯一のインスタンス（実体）を保持する。
	private static Company company = new Company();
	
	// 外部からインスタンスが作成されないようにprivateにする
	private Company() {
		this.userID = 1;
		this.password = "abcd123";
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static Company getCompany() {
		return company;
	}
	
}
