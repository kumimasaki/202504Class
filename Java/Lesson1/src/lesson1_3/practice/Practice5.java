package lesson1_3.practice;

public class Practice5 {

	public static void main(String[] args) {
		// int型の変数「wether」を0か1で初期化(どちらでもOK)
		// 1：晴れ、0：雨
		int wether = 0;

		// String型の変数「hobby」を「読書」で初期化
		String hobby = "読書";

		// 最初にコンソールに「こんにちは」を表示
		System.out.println("こんにちは");

		// もし変数「wether」が1であれば、「今日は晴れです」を表示
		// そうでなければ、「今日は雨です」を表示する
		// もし変数「wether」が0であれば、変数「hobby」を使用して、
		// 「読書をします」と表示する
		if (wether == 1) {
			System.out.println("今日は晴れです");
		} else {
			System.out.println("今日は雨です");
			System.out.println(hobby + "をします");
		}

		// 最後にコンソールに「さようなら」を表示
		System.out.println("さようなら");
	}

}
