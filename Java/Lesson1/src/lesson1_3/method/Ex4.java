package lesson1_3.method;

public class Ex4 {

	public static void main(String[] args) {
		// メソッドの呼び出し
//		int result = calculatingChange(1000, 2000);
//		System.out.println(result);
		System.out.println(calculatingChange(1000, 2000));
	}
	
	// お釣りの計算をするメソッド
	public static int calculatingChange(int totalPrice, int payment) {
//		int change = payment - totalPrice;
//		return change;
		return payment - totalPrice;
	}
}
