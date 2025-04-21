package lesson1_3.practice;

public class Practice2 {
	
	public static void main(String[] args) {
		// while文を使って下記の配列の中身をすべて表示してください
		 String[] cars = {"Volvo","BMW","Ford","Mazda"};
		 int i = 0;
		 while(i < cars.length) {
			 System.out.println(cars[i]);
			 i++;
		 }
	}
}
