package lesson2_1.use_constracter;

public class Cat {
	// メンバ変数
	// 名前
	String name;
	// 年齢
	int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat(String name) {
		this.name = name;
		this.age = 0;
	}

	// デフォルトコンストラクタ
	public Cat() {
		
	}
	

//	// コンストラクタ
//	Cat(String name, int age) {
//		// メンバ変数に値を設定
//		this.name = name;
//		this.age = age;
//	}
}
