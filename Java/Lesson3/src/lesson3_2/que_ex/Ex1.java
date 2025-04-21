package lesson3_2.que_ex;

import java.util.LinkedList;
import java.util.Queue;

public class Ex1 {

	public static void main(String[] args) {
		// キューの宣言
		Queue<Double> numList = new LinkedList<Double>();
		// データの挿入
		numList.offer(1.5);
		numList.offer(2.5);
		numList.offer(3.5);
		// 先頭の要素を取得して削除
		System.out.println(numList.poll());
		System.out.println(numList);
		// 先頭の要素を削除しないで取得
		System.out.println(numList.peek());
		System.out.println(numList);
	}

}
