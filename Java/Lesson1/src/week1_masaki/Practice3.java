package week1_masaki;

public class Practice3 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] array = {5,3,9,1,7};
		// メソッドの呼び出し
		int max = findMax(array);
		System.out.println("Maximum value in the array: " + max);
	}
	
	// 最大値を求めるメソッド
	public static int findMax(int[] arr) {
		// 最大値の初期値を設定
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			// もし、arr[i]の値がmaxの値よりも大きい場合
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
