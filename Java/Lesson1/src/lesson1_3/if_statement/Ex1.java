package lesson1_3.if_statement;

public class Ex1 {

	public static void main(String[] args) {
		// 天気が晴れだったらtrue
		// 雨だったらfalseとする
		boolean wether = false;

		// もし天気が晴れだったら、洗濯物を干す
		// そうでない場合(else)は、昼寝をする
		if (wether == true) {
			System.out.println("洗濯物を干す");
		} else {
			System.out.println("昼寝をする");
		}

		// 練習問題
		// 変数 x を用意し、「7」で初期化
		int x = 7;
		// もし、x の値が偶数であるならば、コンソールに「偶数」と表示
		// そうでない場合は、「奇数」と表示
		if (x % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}

	}

}
