package lesson1_3.overload;

public class Ex1 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		System.out.println(add(2, 2));
		
		// エスケープシーケンス
		// 合計金額は"1200円"です
		System.out.println("合計金額は\"1200円\"です");
	}
	
	// 2つの整数の値の合計を計算
	public static int add(int a, int b) {
		return a + b;
	}
	
	// 1つの整数の値に1を加算
	public static int add(int a) {
		return a + 1;
	}
	
	// 2つの小数の値の合計を計算
	public static double add(double a, double b) {
		return a + b;
	}
	
	// オーバーロードできないパターン
//	public static int add(int aaa) {
//		return aaa + 1;
//	}
//	
//	public static double add(int a) {
//		return a;
//	}

}
