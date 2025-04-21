package lesson2_4.this_and_super;

public class Main {

	public static void main(String[] args) {
		// Personクラスのインスタンス作成
		Person person = new Person();
		// Personクラスのnameをコンソールに出力
		System.out.println(person.name);
		// Personクラスのageをコンソールに出力
		System.out.println(person.age);
	
		// Studentクラスのインスタンス作成
		Student student = new Student("Taro", 20, 100);
		// Studentクラスのdisplayメソッド呼び出し
		student.display();
	}

}
