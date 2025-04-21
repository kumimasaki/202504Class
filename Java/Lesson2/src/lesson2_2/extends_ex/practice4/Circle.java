package lesson2_2.extends_ex.practice4;

public class Circle extends Shape implements Printable{
	// メンバ変数
	double radius;

	// コンストラクタ
	public Circle(double radius) {
		this.radius = radius;
	}

	// インタフェースのメソッドを実装
	@Override
	public void print() {
		System.out.println("Printing a circle with radius: " + radius);
	}
	
}
