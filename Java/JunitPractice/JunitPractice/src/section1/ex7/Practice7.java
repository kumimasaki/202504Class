package section1.ex7;

public class Practice7 {

	public static void main(String[] args) {
		System.out.println(getLength("test"));

	}
	
	/**
	 * 文字列の長さを取得するメソッド。
	 * 
	 * 【機能概要】
	 * 渡された文字列の長さを計算し、その結果を返す。
	 * 
	 * 【引数】
	 * @param str 長さを取得したい文字列
	 * 
	 * 【戻り値】
	 * @return 引数として渡された文字列の長さ（文字数）
	 * 
	 * 【処理の流れ】
	 * 1. 引数として渡された文字列の長さを取得する。
	 * 2. 取得した長さを戻り値として返す。
	 * 
	 * 【前提条件】
	 * - 引数にはnullが渡されないことが前提である。
	 * 
	 */
    public static int getLength(String str) {
        return str.length();
    }

}
