package lesson1_3.break_continue;

public class Practice1 {

	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
			if (i == 2) {
				break;
			}
		}
	}

}
