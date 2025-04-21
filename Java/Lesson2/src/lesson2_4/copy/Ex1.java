package lesson2_4.copy;

public class Ex1 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] a = {1, 1};
		int[] b = {2, 2};
		
		// bの内容をaにコピーする（ディープコピー）
//		for(int i = 0; i < b.length; i++) {
//			a[i] = b[i];
//		}
		
		a = b.clone();
		
		a[0] = 99;
		System.out.println(a[0]);
		System.out.println(b[0]);
		
		
		// 二次元配列の宣言
		int[][] aa = {{1,2},{3,4}};
		int[][] bb = aa.clone();
		aa[0][0] = 100;
		// ディープコピーをしているので、別々の結果が表示されることを確認したい
		System.out.println(aa[0][0]);
		System.out.println(bb[0][0]);

	}

}
