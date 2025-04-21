package lesson2_5;

public class Ex {

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		System.out.println(test(array));
	}
	
	public static String test(int[] array) {
		try {
			System.out.println(array[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			return "In catch block";
		} finally {
			System.out.println("In finally block");
		}
		return "hello";
	}
}