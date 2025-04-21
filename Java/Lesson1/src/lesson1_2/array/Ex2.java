package lesson1_2.array;

public class Ex2 {

	public static void main(String[] args) {
		// 配列の用意
		// 書き方1
		int[] scores = new int[5];
		scores[0] = 10;
//		scores[10] = 100;
		
		// 書き方2
		double[] weight = new double[] {50.5, 60.5};
		
		// 書き方3
		String[] colors = {"red", "black"};
		
		System.out.println(colors.length);
	}

}
