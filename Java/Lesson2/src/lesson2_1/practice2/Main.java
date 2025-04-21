package lesson2_1.practice2;

public class Main {

	public static void main(String[] args) {
		// 以下を引数にしてインスタンスを2つ作成する
		// 「Taro 75」
		// 「Hana 80」
		Student taro = new Student("Taro", 75);
		Student hana = new Student("Hana", 80);
		
		// showScoreメソッドを2回呼び出して、コンソールに表示してください
		taro.showScore();
		hana.showScore();
	}

}
