package practice.com;

public class Cat {
	// メンバ変数
	// String name, int age
	private String name;
	private int age;
	
	// コンストラクタ（すべてのメンバ変数に値を設定）
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
}
