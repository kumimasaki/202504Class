package lesson1_3.for_statement;

public class Ex1 {

	public static void main(String[] args) {
		// 0,1,2,3,4を表示させる
		// 初期値 i：0
		// 繰り返し条件 i < 5
		// 繰り返し時処理　iが1ずつ増える
		for (int i = 0; i < 5; i++) {
			// 変数iの値をコンソールに表示
			System.out.println(i);
		}

		// 2,4,6,8をコンソールに表示させる
		for (int i = 2; i < 9; i += 2) {
			System.out.println(i);
		}
		
		// 1から10までの整数を順番に出力するプログラムを
		// forループを使って書いてください
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		// 一次元配列の初期化
		int[] array = {10, 20, 30, 40, 50};
		
		// for文
		for (int i = 0; i < array.length; i++) {
			// 結果を表示
			System.out.println(array[i]);
		}
		
		double[] array2 = {10.1, 20.2, 30.3};
		
	}

}
