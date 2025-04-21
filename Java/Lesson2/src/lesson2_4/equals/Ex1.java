package lesson2_4.equals;

public class Ex1 {

	public static void main(String[] args) {
		// 文字列の比較
		String a = "Hello";
		String b = new String("Hello");
		
		System.out.println(a == b);		// 住所の比較
		System.out.println(a.equals(b));// ★値の比較
		
		String name = "Taro";
		String userName = "Taro";
		System.out.println(name == userName);
		System.out.println(name.equals(userName));
		
		System.out.println(name.charAt(10));
	}

}
