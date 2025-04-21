package lesson2_1.practice3;

public class Main {

	public static void main(String[] args) {
		// 以下を引数にしてインスタンスを2つ作成する
		// 「Alice 18　料理」
		// 「Bob 28　game」
		Student alice = new Student("Alice", 18, "料理");
		Student bob = new Student("Bob",28,"game");
		
		// helloメソッドを2回呼び出して、コンソールに表示してください
		alice.hello();
		bob.hello();
	}

}
