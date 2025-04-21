package lesson3_2.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnonymityEx {
	
	public static void main(String[] args) {
		List<Cat> list = new ArrayList<Cat>();
		list.add(new Cat("Alice", 12.5));
		list.add(new Cat("Bob", 18.7));
		list.add(new Cat("Mai", 14.5));
		
		// ラムダ式でComparatorを定義
        Collections.sort(list, (cat1, cat2) -> Double.compare(cat1.getWeight(), cat2.getWeight()));
        System.out.println(list);

//		// 匿名クラスの書き方
//		Collections.sort(list, new Comparator<Cat>() {
//			@Override
//			public int compare(Cat cat1, Cat cat2) {
//				if (cat1.getWeight() == cat2.getWeight()) {
//					return 0;
//				} else if (cat1.getWeight() < cat2.getWeight()) {
//					return -1;
//				} else {
//					return 1;
//				}
//			}
//		});
//		System.out.println(list);
	}
}
