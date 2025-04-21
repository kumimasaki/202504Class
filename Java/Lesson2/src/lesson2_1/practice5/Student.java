package lesson2_1.practice5;

public class Student {
	// メンバ変数
	String name;
	int japanese;
	int math;
	int english;

	// コンストラクタ
	Student(String name, int japanese, int math, int english) {
		this.name = name;
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}

	// 表示メソッド
	void show() {
		System.out.println(name + ":" + japanese + "," + math + "," + english);
	}
}
