package lesson3_2.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// リストの宣言
		List<Cat> list = new ArrayList<Cat>();
		// データの挿入
		list.add(new Cat("Kitty", 12.5));
		list.add(new Cat("Bob", 23.6));
		list.add(new Cat("Jon", 10.5));
		
		// 並び替え
		// 第一引数：並び替えたいデータ
		// 第二引数：第二引数に指定された順序で並び変える
		Collections.sort(list, new CatComparator());
		System.out.println(list);
	}
}
