package lesson3_2.lamda_ex;

public class Ex1 {

	public static void main(String[] args) {
		// ラムダ式の書き方
//		Color c = (String color) -> {
//			return color + "色です";
//		};
		
		Color c = color -> color + "色です";
		
		// 呼び出し
		System.out.println(c.write("赤"));
	}

}
