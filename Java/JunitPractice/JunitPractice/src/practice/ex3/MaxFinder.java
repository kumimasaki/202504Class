package practice.ex3;

/**
 * MaxFinder クラスは、整数の配列の中から最大値を見つける機能を提供する
 */
public class MaxFinder {

	/**
	 * 配列内の最大値を検索する。
	 * 配列が null または空である場合、例外をスローする。
	 * 
	 * @param numbers 最大値を検索する整数の配列
	 * @return 配列内の最大値
	 * @throws IllegalArgumentException 配列が null または空の場合
	 */
	public int findMax(int[] numbers) {
		// 配列が null または空の場合、例外をスロー
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Array must not be empty");
		}

		// 配列の最初の要素を初期最大値として設定
		int max = numbers[0];

		// 配列内の各要素と現在の最大値を比較
		for (int number : numbers) {
			if (number > max) {
				// より大きな値が見つかった場合、最大値を更新
				max = number;
			}
		}

		// 配列内の最大値を返す
		return max;
	}
}
