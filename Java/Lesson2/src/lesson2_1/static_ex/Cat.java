package lesson2_1.static_ex;

public class Cat {
	// static変数（クラス変数）
	static int counter = 0;
	// staticのついていないメンバ変数（インスタンス変数）
	String name;

	// コンストラクタ
	public Cat(String name) {
		counter++;
		this.name = name;
//		System.out.println(counter);
	}
	 
	// 鳴くメソッド
	// staticがついていないメソッド
	void meow() {
		// staticがついている変数を表示
		System.out.println(counter);
		// staticがついていない変数を表示
		System.out.println(name);
	}
	
	// 表示メソッド
	// staticがついているメソッド
	static void diplay() {
		// staticがついている変数を表示
		System.out.println(counter);
		// staticがついていない変数を表示
//		System.out.println(name);
	}
	
}
