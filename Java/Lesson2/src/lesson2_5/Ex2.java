package lesson2_5;

public class Ex2 {

	public static void main(String[] args) {
		try {
			arrayTest();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("エラーが発生しました");
		}
	}

	public static void arrayTest() throws ArrayIndexOutOfBoundsException{
		// 無理やりエラーを発生させている
		throw new ArrayIndexOutOfBoundsException();
	}
}
