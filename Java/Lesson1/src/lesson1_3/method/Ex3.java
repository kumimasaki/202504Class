package lesson1_3.method;

public class Ex3 {

	public static void main(String[] args) {
		// メソッドを呼び出す
		greeting("Aさん", 10);
		// Bさんこんにちは！私の年齢は20歳です
		greeting("Bさん", 20);
	}
	
	// 挨拶をするメソッドを作成
	public static void greeting(String name, int age) {
		// name こんにちは！私の年齢は age 歳です
		System.out.println(name + "こんにちは！私の年齢は" + age + "歳です");
	}

}
