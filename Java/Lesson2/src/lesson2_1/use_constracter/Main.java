package lesson2_1.use_constracter;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成
		Cat jon = new Cat("Jon" , 6);
		// 名前、年齢をコンソールに表示
		System.out.println(jon.name);
		System.out.println(jon.age);
		
		Cat kitty = new Cat("Kitty");
		Cat alice = new Cat();
	}

}
