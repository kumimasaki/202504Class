package lesson3_3.other_class;

public class StringBuilderEx {

	public static void main(String[] args) {
		// 確認用
	    System.out.println("０１２３４５６７８９０１２３４５６７８９←インデクス番号");
	    System.out.println("１２３４５６７８９０１２３４５６７８９０←文字数");

	    StringBuilder sb = new StringBuilder();
	    
	    // 文字列結合
	    sb.append("こんにちは。");
	    sb.append("今日はいい天気ですね。");
	    System.out.println(sb);
	    
	    // 文字列挿入 9文字目直後に文字を挿入
	    sb.insert(9, "とても");
	    System.out.println(sb);
	    
	    // 文字列部分置き換え
	    sb.replace(5, 6, "！");
	    System.out.println(sb);
	    
	    // 1文字目から5文字目を"おはようございます"に置き換える
	    sb.replace(0, 5, "おはようございます");
	    System.out.println(sb);
	    
	    // 文字列の部分削除 「今日は」
	    sb.delete(10, 13);
	    System.out.println(sb);
	    
	    // 文字列の検索
	    // 「天気」が最初に出現するインデックス番号を取得
	    System.out.println("「天気」の開始位置⇒" + sb.indexOf("天気"));
	    
	}
}
