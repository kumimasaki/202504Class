package debug;

public class Ex1 {

	public static void main(String[] args) {
		int array2D[][] = new int[][] { { 1, 3 }, { 5, 7, 9 } };
		int total = 0;
		for (int i = 0; i < array2D.length; i++) {
			for (int j = i; i < array2D[i].length; j++) {
				total += array2D[i][j];
			}
		}
		System.out.println(total);
	}
}
