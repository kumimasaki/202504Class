package lesson2_5;

public class Ex1 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] arr = {1, 2, 3};
		String str = null;

		// 試したい処理
		try {
			// nullの処理
			System.out.println(str.length());
			
			// 割り算の処理
			System.out.println(3 / 0);
			
			// 添え字の番号をわざと間違えて実行
			System.out.println(arr[5]);
		} catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			// エラーが起きてしまったときにしたい処理
			System.out.println("添え字の番号、もしくは変数の中身が間違っています");
		} catch(ArithmeticException e) {
			// エラーが起きてしまったときにしたい処理
			System.out.println("割り算の処理を見直してください");
		} finally {
			System.out.println("絶対に実行されるコード！");
		} 
	}

}
