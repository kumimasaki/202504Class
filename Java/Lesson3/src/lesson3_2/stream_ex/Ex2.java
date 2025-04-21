package lesson3_2.stream_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {

	public static void main(String[] args) {
		// リストの宣言
		List<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Alice");
		names.add("Carol");
		names.add("Alice");
		names.add("Dave");

		// 重複しているデータ（Alice）を除く：.distintct()
		// 名前の長さが3文字より大きい人を抽出
		// 名前をabc順に：sorted()
		// Listにまとめて表示
		System.out.println(
				// ラインを作る
				names.stream()
						.distinct()
						.filter(e -> e.length() > 3)
						.sorted()
						.collect(Collectors.toList()));

		names.stream()
				.distinct()
				.filter(e -> e.length() > 3)
				.sorted()
				.forEach(e -> System.out.println(e));

	}

}
