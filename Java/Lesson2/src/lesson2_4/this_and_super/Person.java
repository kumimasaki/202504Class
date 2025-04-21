package lesson2_4.this_and_super;

public class Person {
	// メンバ変数
	protected String name;
	protected int age;
	
	// コンストラクタ
	public Person(String name, int age) {
//		this();
		this.name = name;
		this.age = age;
	}

	// コンストラクタ2
	public Person() {
		this("noname", 0);
		int a = 0;
	}
	
	// メソッド
	// display 戻り値無し、引数なし
	// 処理内容："person"をコンソールに出力
	public void display() {
		System.out.println("person");
	}
}
