package lesson1_2.practice;

public class Practice2 {

	public static void main(String[] args) {
		// 問題1
		// 変数名：hobby　値：読書　で初期化してください
		String hobby = "読書";
		// 変数名；readTime　値：2.5　で初期化してください
		double readTime = 2.5;
		// 実行結果（コンソールに出力）
		// 「私の趣味は読書で2.5時間を使って趣味を楽しみます」
		System.out.println("私の趣味は" + hobby + "で" + readTime + "時間を使って趣味を楽しみます");

		// 問題2
		// 配列変数：scores　値：44,55,77　でscoresを初期化してください
		int[] scores = { 44, 55, 77 };
		// 実行結果（コンソールに出力）
		// 「私の数学の点数は55です」
		System.out.println("私の数学の点数は" + scores[1] + "です");
	}

}
