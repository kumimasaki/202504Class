package week2_masaki.practice3;

public class Main {

	public static void main(String[] args) {
		// 唯一のインスタンスを取得
		Teacher teacher = Teacher.getTeacher();
		System.out.println("name：" + teacher.getName());
		System.out.println("subject：" + teacher.getSubject());
		teacher.teach();
	}
}
