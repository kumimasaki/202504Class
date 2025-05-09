package lesson3_2.practice1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		// Mapの宣言（HashMap）
		Map<String, Student> students = new HashMap<String, Student>();
		// データの追加 ※キーは名前、バリューは生徒の情報
		students.put("Alice", new Student("Alice", 19, 110120));
		students.put("Bob", new Student("Bob", 21, 110121));
		students.put("Carol", new Student("Carol", 20, 110122));
		students.put("Dave", new Student("Dave", 19, 110123));
		// キー「Alice」を指定して、生徒の情報を表示する
		System.out.println(students.get("Alice").getName());
	}

}
