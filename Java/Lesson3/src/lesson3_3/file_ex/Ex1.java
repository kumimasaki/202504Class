package lesson3_3.file_ex;

import java.io.File;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		// ファイルクラスを使ってファイルを指定する
		File file = new File("practice1.txt");
		// もし practice1.txtが存在していなかった場合、practice1.txtを作成し、絶対パスを出力
		// 存在していたら、ファイルサイズを出力
		if (!file.exists()) {
			try {
				// ファイルを作成
				file.createNewFile();
				// ファイルの絶対パスを出力
				System.out.println(file.getAbsolutePath());
			} catch (IOException e) {
				// 例外がどこで発生したか出力
				e.printStackTrace();
			}
		} else {
			// ファイルが存在する場合
			// ファイルサイズを出力
			System.out.println(file.length());
		}

		// フォルダの作成
		File dir = new File("test");
		dir.mkdir();

		// ファイルの作成
		// testファルダの中に「hello.txt」ファイルを作成
		File file2 = new File("test/hello.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
