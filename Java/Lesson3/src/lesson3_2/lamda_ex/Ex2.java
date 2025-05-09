package lesson3_2.lamda_ex;

public class Ex2 {

	public static void main(String[] args) {
		// ラムダ式の書き方
//		Introduce i = (String name, String hobby) -> {
//			String hello = "name：" + name + " hobby：" + hobby;
//			return hello;
//		};
		
		// 定数として認識されてしまうので代入はできない。コンパイルエラー。
//		int age = 20;
//		String name;
		Introduce i = (name, hobby) -> {
//			age = 30;
			// 引数と同名の変数名を用意することはできない。コンパイルエラー。
//			String name;
			String hello = "name：" + name + " hobby：" + hobby;
			return hello;
		};
		
		// 呼び出し
		System.out.println(i.intro("Alice", "Game"));
		
	}

}
