package lesson1_3.method;

public class Ex2 {

	public static void main(String[] args) {
		// メソッドを呼び出す
		greeting("Aさん");
		greeting("Bさん");
	}
	
	// 挨拶をするメソッドを作成
	public static void greeting(String name) {
		System.out.println(name + "、こんにちは");
	}

}
