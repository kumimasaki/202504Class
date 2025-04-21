package lesson2_3.capsule.practice5;

public class Member {
	// メンバ変数
	private String name;
	private Coupon coupon;
	
	// コンストラクタ
	public Member(String name) {
		this.name = name;
	}
	
	public int useCoupon(int price) {
		return (int)(price * coupon.getRate());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
}
