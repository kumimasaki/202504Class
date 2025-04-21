package lesson1_3.if_statement;

public class Practice1 {

	public static void main(String[] args) {
		// 変数の初期化
		int a = 5;
		int b = 8;
		
		// aがbより大きい場合
		if(a > b) {
			System.out.println(a + "が大きいです");
		} else if(b > a) {
			// bがaより大きい場合
			System.out.println(b + "が大きいです");
		} else {
			// aとbが等しい場合
			System.out.println("2つの数は等しいです");
		}

	}

}
