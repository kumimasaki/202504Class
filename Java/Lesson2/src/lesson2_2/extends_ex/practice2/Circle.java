package lesson2_2.extends_ex.practice2;

public class Circle implements Shape{
	// メンバ変数
	// 半径
	double radius;

	// コンストラクタ
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}
	
}
