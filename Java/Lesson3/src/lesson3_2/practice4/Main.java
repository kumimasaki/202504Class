package lesson3_2.practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// Personのインスタンスを作成
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("tanaka", 28));
		personList.add(new Person("suzuki", 25));
		personList.add(new Person("izawa", 32));

		// 拡張for文を使用して表示
		for (Person p : personList) {
			System.out.println(p.getName() + "は" + p.getAge() + "歳");
		}

		System.out.println("1件目は" + personList.get(0).getName() + "さんです。");

		// 並び替えして表示
		System.out.println(
				personList.stream()
						.sorted((s1, s2) -> s1.getAge() - s2.getAge())
						.collect(Collectors.toList()));

//		personList.stream()
//				.sorted((s1, s2) -> s1.getAge() - s2.getAge()) // 小⇒大
//				.forEach(e -> System.out.println(e.getName() + "は" + e.getAge() + "歳"));
	}
}
