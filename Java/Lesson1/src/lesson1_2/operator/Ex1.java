package lesson1_2.operator;

public class Ex1 {

	public static void main(String[] args) {
		// 算術演算子
		// 足し算
		System.out.println(4 + 7);
		// 掛け算
		System.out.println(5 * 3);
		// 割り算
		System.out.println(5 / 3);
		// intよりもdoubleの方が大きい型になるので、double型で演算される
		System.out.println(5.0f / 3);
		// 余りの計算（剰余）
		System.out.println(5 % 3);
		
		// 片方のデータ型がStringの場合、もう片方もStringに変換して連結する
		System.out.println(2 + 3 + "10" + 4 + 6); // ⇒51046
	}

}
