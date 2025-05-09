package lesson3_2.practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Listの宣言
		List<Integer> list = new ArrayList<Integer>();

		// データの挿入
		list.add(15);
		list.add(20);
		list.add(30);
		list.add(45);
		list.add(55);

		// 偶数の要素をすべて削除
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
				i--;
			}
		}
		// 後ろからループすることで
		// 削除によるインデックスずれの影響を受けない
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) % 2 == 0) {
				list.remove(i); // 削除しても後ろには影響なし！
			}
		}

		// リストの全要素の合計を計算
		int sum = 0;
		for (int num : list) {
			sum += num;
		}

		System.out.println("リストの全要素の合計: " + sum);
	}

}
