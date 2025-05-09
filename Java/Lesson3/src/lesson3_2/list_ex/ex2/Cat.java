package lesson3_2.list_ex.ex2;

public class Cat {
	// メンバ変数
	// 名前
	private String name;
	// 年齢
	private int age;
	
	// コンストラクタ
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toStringのオーバーライド
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}