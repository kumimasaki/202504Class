package lesson2_4.this_and_super;

public class Student extends Person{
	// メンバ変数
	private int score;

	// コンストラクタ
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	// メソッド
	// display オーバーライド
	// 処理内容："student"をコンソールに表示
	@Override
	public void display() {
		System.out.println("student");
		super.display();
	}
	
}
