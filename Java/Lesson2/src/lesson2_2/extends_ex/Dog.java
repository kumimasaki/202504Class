package lesson2_2.extends_ex;

public class Dog extends Animal implements Runnable{
	// Animalクラスを継承
	// String color をメンバ変数(犬クラス独自)として宣言
	String color;

	// コンストラクタを作成して、親クラスのname,ageに値を設定できるようにする
	// color(犬クラス独自)にも値が代入できるようにする
	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	@Override
	void sounds() {
		System.out.println("ワンと鳴く");
	}

	@Override
	public void run() {
		System.out.println("犬が走る");
	}
	
}
