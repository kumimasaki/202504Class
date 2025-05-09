package lesson3_2.list_ex;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		// リストの宣言
		List<Integer> test = new ArrayList<Integer>();
		test.add(5);
		test.add(2);
		test.remove(1);
		test.remove(5);
		
		List<String> studentNames = new ArrayList<String>();
		// データの挿入
		studentNames.add("Alice");
		studentNames.add("Bob");
		studentNames.add("Carol");
		// 要素を指定して追加
		studentNames.add(3, "Dave");
		// データの削除
		studentNames.remove(3);
		studentNames.remove("Alice");
		// データの取得
		System.out.println(studentNames.get(0));
		// データの上書き
		studentNames.set(0, "Kitty");
		// 要素の個数の取得
		System.out.println(studentNames.size());
		
		for (String name : studentNames) {
			System.out.println(name);
		}
		
		// 不可変なリスト
//		List<String> names = List.of("Taro", "Hana");
//		names.add("Test");
		
		System.out.println(studentNames);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		System.out.println(nums.get(0));
	}

}
