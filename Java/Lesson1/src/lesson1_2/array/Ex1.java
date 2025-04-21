package lesson1_2.array;

public class Ex1 {

	public static void main(String[] args) {
		// テストの点数を格納する配列を宣言
		int[] scores;
		// 要素を作成し、変数に格納する
		scores = new int[5];
		// 要素0番目の箱に値を入れる
		scores[0] = 40;
		// 要素0番目の箱の中身を表示
		System.out.println(scores[0]);
		// 要素3番目の箱に値を入れる(60)
		scores[3] = 60;
		// 要素3番目の箱の中身を表示
		System.out.println(scores[3]);
	}

}
