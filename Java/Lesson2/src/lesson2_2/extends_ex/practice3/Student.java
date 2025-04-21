package lesson2_2.extends_ex.practice3;

public class Student extends Person implements Subject{

	// コンストラクタ
	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void study() {
		System.out.println(name + "が勉強中です。");
	}
}
