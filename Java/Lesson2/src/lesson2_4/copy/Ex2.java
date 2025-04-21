package lesson2_4.copy;

public class Ex2 {

	public static void main(String[] args) {
		// 二次元配列の宣言
		int[][] a = {{1, 2},{3, 4}};
		int[][] b = a.clone(); // 縦列のコピー
		
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i].clone(); // 横列のコピー
		}
		
		a[0][0] = 100;
		System.out.println(a[0][0]);
		System.out.println(b[0][0]);
	}

}
