package lesson2_3.capsule.practice3;

public class Person {
	// メンバ変数
	// 名前
	private String name;
	// 年齢
	protected int age;
	
	// コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}
