package lesson3_2.practice3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// リストの宣言
		List<Book> books = new ArrayList<Book>();
		// データの追加
		books.add(new Book("吾輩は猫である", "夏目漱石", "フィクション"));
		books.add(new Book("銀河鉄道の夜", "宮沢賢治", "ファンタジー"));
		books.add(new Book("こころ", "夏目漱石", "フィクション"));
		// 本のジャンルが「フィクション」のデータを出力
		for (Book b : books) {
			if("フィクション".equals(b.getGenre())) {
				System.out.println(b);
			}
		}
	}
}
