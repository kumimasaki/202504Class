package lesson1_2.cast;

public class Ex1 {

	public static void main(String[] args) {
		// 小さい型を大きい型に入れる
		int a = 20;
		double b;
		b = a;
		System.out.println(b);
		
		// 大きい型を小さい型に入れる
		double c = 150.5;
		int d;
		d = (int)c;
		System.out.println(d);
	}

}
