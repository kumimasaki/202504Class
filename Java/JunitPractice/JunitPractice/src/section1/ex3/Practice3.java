package section1.ex3;

public class Practice3 {

	public static void main(String[] args) {
		// メソッドを呼び出す
		System.out.println(calculate(4));
	}
	
	/**
	 * 整数の二乗を計算して返すメソッド。
	 * 
	 * 【機能概要】
	 * 渡された整数の二乗を計算し、その結果を返す。
	 * 
	 * 【引数】
	 * @param num 二乗計算の対象となる整数
	 * 
	 * 【戻り値】
	 * @return 引数として渡された整数の二乗値
	 * 
	 * 【処理の流れ】
	 * 1. 引数として渡された整数を取得する。
	 * 2. その整数を自分自身と掛け合わせることで二乗を計算する。
	 * 3. 計算結果を戻り値として返す。
	 * 
	 * 【前提条件】
	 * - 入力値として正の値、負の値、または0を受け入れる。
	 * - 計算結果がint型の範囲を超えた場合、オーバーフローの可能性がある。
	 * 
	 */
	public static int calculate(int num) {
	    return num * num;
	}
}

