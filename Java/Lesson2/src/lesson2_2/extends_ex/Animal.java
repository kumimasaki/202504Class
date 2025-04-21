package lesson2_2.extends_ex;

// 親クラス（スーパークラス）
public class Animal {
	// メンバ変数
	// 名前
	String name;
	// 年齢
	int age;

	// コンストラクタ
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 食べるメソッド eat
	// 戻り値無し、引数：String food
	void eat(String food) {
		// 「food を食べます」をコンソールに表示
		System.out.println(food + "を食べます");
	}

	// 鳴くメソッド
	void sounds() {
		System.out.println("鳴く");
	}
}
