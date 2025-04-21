package lesson2_3.capsule.singleton;

public class Main {

	public static void main(String[] args) {
		// Companyクラスから唯一のインスタンスを取得 
		Company user = Company.getCompany();
		// 社員IDを取得し、表示。
		System.out.println(user.getUserID());
	}

}
