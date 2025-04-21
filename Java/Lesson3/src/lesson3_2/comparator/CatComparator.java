package lesson3_2.comparator;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat cat1, Cat cat2) {
		if (cat1.getWeight() == cat2.getWeight()) {
			// 値が等しい場合
			return 0;
		} else if (cat1.getWeight() < cat2.getWeight()) {
			// 第一引数の方が小さい場合
			return -1;
		} else {
			// 第二引数の方が小さい場合
			return 1;
		}
	}
}
