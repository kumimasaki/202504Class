package lesson1_3.method.practice;

public class Practice2 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		int result = calculateSum(5,3);
		System.out.println("合計：" + result);
	}
	
	// 2つの整数を引数として受け取り、その合計を返すメソッドcalculateSumを作成
	public static int calculateSum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

}
