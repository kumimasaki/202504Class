package lesson2_3.capsule;

public class Bank {
	// メンバ変数
	// ユーザー名（公開）
	public String userName;
	// 残高（非公開）
	private int balanceOfBank;
	// パスワード（非公開）
	private int password;
	
	// コンストラクタ
	public Bank(String userName, int balanceOfBank, int password) {
		this.userName = userName;
		this.balanceOfBank = balanceOfBank;
		this.password = password;
	}

	// ゲッターセッター
	public int getBalanceOfBank() {
		return balanceOfBank;
	}

	public void setBalanceOfBank(int balanceOfBank) {
		this.balanceOfBank = balanceOfBank;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
}
