package lesson2_2.extends_ex.practice1;

public class Main {

	public static void main(String[] args) {
		// インスタンス化
		Car car = new Car("BMW");
		// 親クラスの振る舞い呼び出し
		car.displayBrand();
		// 自分独自の振る舞いを呼び出す
		car.drive();
	}

}
