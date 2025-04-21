package lesson1_3.break_continue;

public class Ex2 {

	public static void main(String[] args) {
		// continue
		for (int i = 1; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			// 変数iを出力
			System.out.println(i);
		}
	}

}
