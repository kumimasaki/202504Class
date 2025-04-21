package lesson1_2.array;

public class Array2d {

	public static void main(String[] args) {
		// 二次元配列の宣言
		int[][] allScore = new int[2][3];
		allScore[0][0] = 1;
		allScore[1][2] = 5;
		System.out.println(allScore[0][0]);
		System.out.println(allScore[1][2]);
		
		// 二次元配列の初期化
		int[][] array2D = {{2, 4, 6}, {8, 10, 12}};
		System.out.println(array2D[0][2]);
	}

}
