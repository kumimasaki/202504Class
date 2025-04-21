package lesson2_2.extends_ex.practice2;

public class Rectangle implements Shape {

	// メンバ変数
	// 幅
	double width;
	// 高さ
	double height;

	// コンストラクタ
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
