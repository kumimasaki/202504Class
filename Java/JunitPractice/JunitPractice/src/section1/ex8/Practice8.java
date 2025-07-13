package section1.ex8;

public class Practice8 {

	public static void main(String[] args) {
		// メソッドを呼び出す
		String str = "test";
		String prefix = "t";
		System.out.println(startsWithPrefix(str, prefix));
	}
	
	/**
	 * 指定された接頭辞で文字列が始まるかどうかを判定するメソッド。
	 * 
	 * 【機能概要】
	 * 渡された文字列が指定された接頭辞で始まるかを判定し、結果を返す。
	 * 
	 * 【引数】
	 * @param str 判定対象の文字列
	 * @param prefix 判定する接頭辞
	 * 
	 * 【戻り値】
	 * @return 接頭辞で始まる場合は100、そうでない場合は0
	 * 
	 * 【処理の流れ】
	 * 1. 引数として渡された文字列または接頭辞がnullでないことを確認する。
	 * 2. 文字列が指定された接頭辞で始まるかを判定する。
	 * 3. 始まる場合は100を、始まらない場合は0を返す。
	 * 
	 * 【前提条件】
	 * - 引数として渡された文字列または接頭辞がnullの場合、0を返す。
	 * 
	 */
    public static int startsWithPrefix(String str, String prefix) {
        if (str == null || prefix == null) {
            return 0;
        }
        if(str.startsWith(prefix)) {
        	return 100;
        } else {
        	return 0;
        }
    }

}
