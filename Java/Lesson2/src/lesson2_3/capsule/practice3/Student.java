package lesson2_3.capsule.practice3;

public class Student extends Person{
	// メンバ変数
	// 学生ID
	private String studentId;

	// コンストラクタ
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}
