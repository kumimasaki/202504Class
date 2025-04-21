package lesson3_3.final_ex;

public class Cat {
	// メンバ変数
	// 1.宣言時に初期化する
//	private final String name = "Alice";
	// 2.宣言のみ
	private final String name;
	
	// 定数（必ず初期化が必要）
	private static final int CAT_AGE = 5;
	
	// すべてのコンストラクタで値を代入する必要がある
	public Cat() {
		this.name = "Alice";
	}
	
	public Cat(String name) {
		this.name = name;
	}
}
