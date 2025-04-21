package week2_masaki.practice1;

public class Square extends Rectangle{

	// コンストラクタ
	public Square(double side) {
		super(side, side);
	}

	// インターフェースのメソッドのオーバーライド
	// 表示メソッド
	@Override
	public void printx() {
		System.out.println("正方形の辺の長さ：" + super.width
				+ "、面積：" + getArea()
				+ "、周長：" + super.getPerimeter());
	}
	
}
