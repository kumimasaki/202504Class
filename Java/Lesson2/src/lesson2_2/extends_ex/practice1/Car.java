package lesson2_2.extends_ex.practice1;

//サブクラス（子クラス）
public class Car extends Vehicle{

	// コンストラクタ
	public Car(String brand) {
		super(brand);
	}
	
	// 文字列表示メソッド
	void drive() {
		System.out.println("car is driving");
	}
}
