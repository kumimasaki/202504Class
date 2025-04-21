package lesson1_3.switch_case;

public class Ex1 {

	public static void main(String[] args) {
		// 運勢占いゲーム

		// 好きな番号を変数に格納
		int fortune = 1;

		// fortuneという変数の値に基づいて異なる処理を行うswitch文
		switch (fortune) {
		// 1の場合
		case 1:
			// 大吉をコンソールに表示
			System.out.println("大吉");
			// 処理を終了し、switch文を抜ける
			break;
		// 2の場合
		case 2:
			// 中吉をコンソールに表示
			System.out.println("中吉");
			break;
		default:
			System.out.println("凶");
		}

	}

}
