package lesson2_2.extends_ex;
// 子クラス（サブクラス）
public class Cat extends Animal implements Runnable{
	// メンバ変数(猫クラス独自のメンバ変数)
	// 色
	String color;
	int age = 100;

	// コンストラクタ
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	// メソッド（猫独自）
	void meow() {
		System.out.println("ニャー");
	}
	
	@Override
	public void sounds() {
		System.out.println("ニャーと鳴く");
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + "]";
	}

	@Override
	public void run() {
		System.out.println("猫が走る");
	}
	
}
