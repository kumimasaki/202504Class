package lesson2_2.abstract_ex;

public class Main {

	public static void main(String[] args) {
		// 抽象クラスはインスタンス化できない
//		Animal animal = new Animal("animal");
		
		Cat bob = new Cat("Bob", "black");
		bob.eat("キャットフード");
		bob.sleep();
	}

}
