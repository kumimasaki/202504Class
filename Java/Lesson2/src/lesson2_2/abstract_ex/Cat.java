package lesson2_2.abstract_ex;

public class Cat extends Animal{
	// メンバ変数
	String color;

	// コンストラクタ
	// 親クラスのコンストラクタ呼び出し
	// 自分のcolorへ値を設定
	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}

	@Override
	public void eat(String food) {
		System.out.println(food + "を食べます");
	}

	@Override
	public void sleep() {
		System.out.println("sleep");
	}

}
