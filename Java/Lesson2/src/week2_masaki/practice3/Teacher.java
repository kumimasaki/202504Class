package week2_masaki.practice3;

public class Teacher {
	// メンバ変数
	// 名前
	private String name;
	// 科目
	private String subject;
	// 唯一のインスタンスを保持
	public static Teacher teacher = new Teacher();

	// コンストラクタ
	private Teacher() {
		this.name = "Alice";
		this.subject = "Japanese";
	}
	
	// 文字列表示メソッド
	public void teach() {
		System.out.println("Hello");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static Teacher getTeacher() {
		return teacher;
	}
	
}
