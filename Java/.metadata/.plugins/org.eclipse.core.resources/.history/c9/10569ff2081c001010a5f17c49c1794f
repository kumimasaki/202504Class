package week3_masaki.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// リストの作成
		List<Student> student = new ArrayList<>();
		student.add(new Student("Alice", 15, 60));
		student.add(new Student("Takuya", 12, 90));
		student.add(new Student("Ryo", 25, 34));
		student.add(new Student("Suzanu", 18, 20));

		// 1:生徒の点数が60点未満を抽出
		// 2:生徒の点数を大⇒小に並び替える
		System.out.println(
				student.stream()
						.filter(e -> e.getScore() < 60)
						.sorted((s1, s2) -> s2.getScore() - s1.getScore())
						.collect(Collectors.toList()));
	}

}
