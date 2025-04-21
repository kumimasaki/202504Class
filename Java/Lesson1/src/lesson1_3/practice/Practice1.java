package lesson1_3.practice;

public class Practice1 {
	
	public static void main(String[] args) {
		// for文を使って下記の配列の中身をすべて表示してください
		// 拡張for文ではなく
		String[] cars = {"Volvo","BMW","Ford","Mazda"};
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}
