package week1_masaki;

public class Practice1 {

	public static void main(String[] args) {
		// 変数を初期化
		int isHungry = 0;
		String food = "ハンバーグ";
		
		// 「こんにちは」を表示
		System.out.println("こんにちは");
		
		// もしisHungryが1であれば「お腹がいっぱいです」
		// そうでなければ「はらぺこです」を表示
		if (isHungry == 1) {
			System.out.println("お腹がいっぱいです");
		} else{
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		
		// 「ごちそうさまでした」を表示
		System.out.println("ごちそうさまでした");
		
	}

}
