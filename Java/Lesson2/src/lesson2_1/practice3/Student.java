package lesson2_1.practice3;

public class Student {
	/**
	 * 	★(Student クラスの仕様)
		次のフィールド、メソッド、コンストラクタを作成してください。
	  　　・フィールド（メンバ変数）を作成する
		  ・name を String型で宣言する
		  ・age を int型で宣言する
		  ・hobby を String型で宣言する
		・コンストラクタを作成する。
		  引数：name,age,hobby
		  処理内容：引数を使ってメンバ変数を初期化する。
		・メソッド「hello」を作成する。
		  引数：なし
		  戻り値：なし
		  処理内容：フィールドを用いて「nameはage歳で趣味はhobbyです」と表示する
	 */
	// メンバ変数
	// 名前
	String name;
	// 年齢
	int age;
	// 趣味
	String hobby;
	
	// コンストラクタ
	public Student(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	// helloメソッド
	void hello() {
		System.out.println(name + "は" + age + "歳で趣味は" + hobby + "です");
	}
}
