package lesson1_3.method.practice;

public class Practice1 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		String result = checkParity(3);
		System.out.println(result);
	}
	
	// 整数のパリティを確定するメソッドを作成
	public static String checkParity(int num) {
		// 偶数か奇数かを判定
		if (num % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

}
