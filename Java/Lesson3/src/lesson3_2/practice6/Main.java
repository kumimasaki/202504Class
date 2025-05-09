package lesson3_2.practice6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// Listの宣言
		List<Teacher> teacher = new ArrayList<>();
		// データの挿入
		teacher.add(new Teacher("Sasaki", 50));
		teacher.add(new Teacher("Tanaka", 24));
		teacher.add(new Teacher("Suzuki", 39));

		// 教師の年齢を大きい順に並び替えて表示する
		System.out.println(
				// ラインを作る
				teacher.stream()
						.sorted((s1, s2) -> s2.getAge() - s1.getAge())
						.collect(Collectors.toList()));

//		teacher.stream()
//				.sorted((s1, s2) -> s2.getAge() - s1.getAge())
//				.forEach(System.out::println);
	}
}
