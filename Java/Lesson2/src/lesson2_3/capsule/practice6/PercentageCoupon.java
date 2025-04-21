package lesson2_3.capsule.practice6;

public class PercentageCoupon implements Coupon {
	// メンバ変数
	public double rate;

	// コンストラクタ
	public PercentageCoupon(double rate) {
		this.rate = rate;
	}

	// 値下げメソッド
	@Override
	public int discount(int amount) {
		return (int) (amount * rate);
	}
}
