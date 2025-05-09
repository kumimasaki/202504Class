package lesson3_3.regex_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		
		String str = "Apple";
		
		// Stringクラスのmatchesメソッド
		System.out.println(str.matches("A.*le"));
		
		// Patternクラスのmatchesメソッド
		System.out.println(Pattern.matches("A[abc]+le", str));
		
		// PatternクラスとMacherクラスを使って部分文字列を検索する
		Matcher matcher = Pattern.compile("A[abc]+le").matcher("Apple Aabcle Appple");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		// 呼び出し
		if (valid("Apple")) {
			System.out.println("一致しました");
		} else {
			// エラー処理
		}
	}
	
	// 正規表現チェックメソッド
	public static boolean valid(String str) {
		return str.matches("A.*le");
	}
	
}
