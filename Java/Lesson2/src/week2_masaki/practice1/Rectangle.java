package week2_masaki.practice1;

public class Rectangle implements Printx{
	// メンバ変数
	// 高さ
	protected double height;
	// 幅
	protected double width;
	
	// コンストラクタ
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	// 面積計算メソッド
	public double getArea() {
		return height * width;
	}
	
	// 周長計算メソッド
	public double getPerimeter() {
		return (height + width) * 2;
	}

	// インターフェースのメソッドのオーバーライド
	// 表示メソッド
	@Override
	public void printx() {
		System.out.println("長方形の高さ：" + height
				+ "、幅：" + width
				+ "、面積：" + getArea()
				+ "、周長：" + getPerimeter());
	}

}
