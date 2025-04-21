package lesson2_3.capsule.singleton.practice;

public class Main {

	public static void main(String[] args) {
		// Loginクラスから唯一のインスタンスを取得 変数名をuserLoginとすること
		Login userLogin = Login.getLogin();
		// ユーザー名を取得し、表示。
		System.out.println(userLogin.getUserName());
		// パスワードを取得し、表示。
		System.out.println(userLogin.getPassword());
		// ログイン認証を実行し、結果を表示。
		userLogin.auth();
	}

}
