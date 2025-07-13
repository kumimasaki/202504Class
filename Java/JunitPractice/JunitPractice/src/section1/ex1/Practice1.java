package section1.ex1;

public class Practice1 {
	
	public static void main(String[] args) {
		// メソッドを呼び出す
		int[] arr1 = {1, 2, 3};
		System.out.println(findMax(arr1));
	}

	/**
	 * 配列内の最大値を返すメソッド。
	 * 
	 * 【機能概要】
	 * 与えられた整数型配列の中から最大値を検索し、その値を返す。
	 * 
	 * 【引数】
	 * @param arr 最大値を検索する対象の整数型配列
	 *            - 配列は空であってはならない。
	 *            - nullが渡された場合、例外をスローする。
	 * 
	 * 【戻り値】
	 * @return 配列内の最大値
	 * 
	 * 【処理の流れ】
	 * 1. 配列の最初の要素を初期値として変数maxに設定する。
	 * 2. 配列の各要素をループで確認する。
	 *    - 現在の最大値（max）よりも大きな値が見つかった場合、maxを更新する。
	 * 3. 配列内のすべての要素を確認し終えた時点で、最大値を返す。
	 * 
	 * 【前提条件】
	 * - 配列がnullまたは空の場合は、例外をスローする。
	 * - 配列に負の値が含まれる場合でも正しく動作する。
	 * 
	 */
	public static int findMax(int[] arr) {
	    int max = arr[0];
	    for (int num : arr) {
	        if (num > max) {
	            max = num;
	        }
	    }
	    return max;
	}

}
