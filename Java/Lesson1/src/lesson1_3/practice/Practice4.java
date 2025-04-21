package lesson1_3.practice;

public class Practice4 {

	public static void main(String[] args) {
		// 1から20までの整数の合計を計算し、その結果を出力するプログラム
		int sum = 0;
		for(int i = 1; i < 21; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println("合計：" + sum);
	}

}
