package lesson1_3.practice;

public class Practice3 {
	
	public static void main(String[] args) {
		// do-while文を使って下記の配列の中身をすべて表示してください
		String[] cars = {"Volvo","BMW","Ford","Mazda"};
		int i = 0;
		do {
			System.out.println(cars[i]);
			i++;
		} while(i < cars.length);
	}
}
