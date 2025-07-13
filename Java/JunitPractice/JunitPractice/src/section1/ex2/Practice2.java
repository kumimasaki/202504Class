package section1.ex2;

public class Practice2 {

	public static void main(String[] args) {
		// メソッドを呼び出す
		System.out.println(isLengthThreeOrMore("test"));
	}
	
	/**
	 * 文字列の長さが3文字以上かどうかを判定するメソッド。
	 * 
	 * 【機能概要】
	 * 渡された文字列が3文字以上であるかを判定し、結果を返す。
	 * 
	 * 【引数】
	 * @param str 判定対象の文字列
	 *            - nullが渡された場合は、falseを返す。
	 * 
	 * 【戻り値】
	 * @return true  文字列の長さが3文字以上の場合
	 *         false 文字列がnull、または長さが3文字未満の場合
	 * 
	 * 【処理の流れ】
	 * 1. 文字列がnullでないかを判定する。
	 * 2. 文字列の長さを取得し、3以上であるかを判定する。
	 * 3. 条件を満たす場合はtrueを返し、満たさない場合はfalseを返す。
	 * 
	 * 【前提条件】
	 * - nullまたは空の文字列も入力可能。
	 * - 入力される文字列が特殊文字や空白のみの場合も、長さで判定する。
	 * 
	 */
	public static boolean isLengthThreeOrMore(String str) {
		if(str != null && str.length() >= 3) {
			return true;
		} else {
			return false;
		}
	}
}
