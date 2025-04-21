package lesson2_3.capsule.singleton.practice2;

public class Main {

	public static void main(String[] args) {
		// Bankクラスから唯一のインスタンスを取得
		Bank bank = Bank.getBank();
		// ユーザー名を取得し、表示。
		System.out.println("名前：" + bank.getUserName());
		// パスワードを取得し、表示。
		System.out.println("パスワード：" + bank.getPassword());
		// アカウント確認メソッドを実行し、結果を表示。
		bank.checkAccount();
	}

}
