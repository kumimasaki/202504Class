package section1.ex4;

public class Practice4 {

	public static void main(String[] args) {
		// メソッドを呼び出す
		System.out.println(canAccessService(18, true));
	}

	/**
	 * 年齢と会員ステータスに基づいてアクセスを許可するかを判定するメソッド。
	 * 
	 * 【機能概要】
	 * 渡された年齢と会員ステータスに基づいて、サービスへのアクセスを許可するかを判定する。
	 * 
	 * 【引数】
	 * @param age 年齢（整数）
	 * @param isMember 会員ステータス（true: 会員、false: 非会員）
	 * 
	 * 【戻り値】
	 * @return アクセスを許可する場合はtrue、許可しない場合はfalse
	 * 
	 * 【処理の流れ】
	 * 1. 年齢が18歳以上の場合、会員かどうかを確認する。
	 * 2. 会員であればアクセスを許可。会員でなければ、65歳以上ならアクセスを許可。
	 * 3. 年齢が18歳未満の場合、会員かどうかを確認する。
	 * 4. 会員であれば、16歳以上ならアクセスを許可。会員でなければアクセスを許可しない。
	 * 
	 * 【前提条件】
	 * - 年齢は0以上の整数とする。
	 * - 会員ステータスはboolean型で提供される。
	 * 
	 */
	public static boolean canAccessService(int age, boolean isMember) {
		// 18歳以上の場合
		if (age >= 18) { 
	        if (isMember) {
	        	// 会員であればアクセスを許可
	            return true;
	        } else {
	        	// 会員でなくても65歳以上ならアクセスを許可
	            return age >= 65; 
	        }
	     // 18歳未満の場合
	    } else { 
	        if (isMember) {
	        	// 16歳以上の会員はアクセスを許可
	            return age >= 16;
	        } else {
	        	// 18歳未満かつ会員でない場合はアクセス不可
	            return false; 
	        }
	    }
	}
}
