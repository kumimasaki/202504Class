package lesson2_1.practice4;

public class Main {

	public static void main(String[] args) {
		// 2つインスタンスを作成する。下記を引数として渡す。
		// 1つ目のインスタンス作成：半径 = 2.0
		// 2つ目のインスタンス作成：半径 = 10.0
		Circle result1 = new Circle(2.0);
		Circle result2 = new Circle(10.0);
		
		// 円の面積を求めた結果をコンソールに2つ表示してください。
		System.out.println(result1.area());
		double a = result2.area();
		System.out.println(a);
		
		Circle[] result3 = new Circle[2];
		result3[0] = new Circle(2.0);
		result3[1] = new Circle(10.0);
	}

}
