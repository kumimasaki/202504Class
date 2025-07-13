package section1.ex6;

public class Practice6 {

	public static void main(String[] args) {
		// メソッドを呼び出す
		int[] arr = {1, 2, 3};
		System.out.println(getElementAtIndex(arr, 5));
	}

    // 配列の指定したインデックスの要素を取得するメソッド
    public static int getElementAtIndex(int[] arr, int index) {
        return arr[index]; // 不正なインデックスの場合、ArrayIndexOutOfBoundsException がスローされる
    }
}
