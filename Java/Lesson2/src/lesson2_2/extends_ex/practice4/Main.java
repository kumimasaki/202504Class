package lesson2_2.extends_ex.practice4;

public class Main {

	public static void main(String[] args) {
		// サークルオブジェクトの作成
		Circle myCircle = new Circle(5.0);
		// 親クラスのメソッド呼び出し
		myCircle.draw();
		// インタフェースのメソッド呼び出し
		myCircle.print();
	}

}
