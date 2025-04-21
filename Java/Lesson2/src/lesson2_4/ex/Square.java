package lesson2_4.ex;

public class Square extends Rectangle{

	// コンストラクタ
	// 親クラスのコンストラクタを呼び出す
	public Square(double height) {
		super(height, height);
	}

	// displayメソッドのオーバーライド
	// 処理内容：
	// 「正方形の計算結果です」をコンソールに表示する
	// 親クラスのdisplayメソッドを呼び出す
	@Override
	public void display() {
		System.out.println("正方形の計算結果です。");
		super.display();
	}
	
}
