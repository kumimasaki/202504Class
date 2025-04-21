package lesson2_3.capsule.practice5;

public class Coupon {
	// メンバ変数
	private String name;
	private double rate;
	
	// コンストラクタ
	public Coupon(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
