package lesson1_3.method.practice;

public class Practice3 {

	public static void main(String[] args) {
		int[] array = {5, 10, 15, 20};
		double average = calculateAverage(array);
		System.out.println("平均値: " + average);
	}
	
	// 配列内の全ての要素の平均値を計算して返すメソッド calculateAverage を作成
	public static double calculateAverage(int[] arr) {
		// 合計を計算
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		double result = (double)sum / arr.length;
		return result;
	}
}
