package lesson3_3.file_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
		// ファイルクラスを使ってファイルを指定
		File file = new File("practice2.txt");

		// ファイルの作成
		// もしファイルが存在していない場合は、ファイルを作成して、絶対パスを出力
		// 存在していたら、ファイルのサイズを出力する
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println(file.getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(file.length());
		}

		// ファイルの書き込み操作
		// try-with-resourse
		try (
				// close処理が必要な処理
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);) {
			// 文字列をファイルに書き込む
			bw.write("Line 1");
			// 改行
			bw.newLine();
			bw.write("Line 2");
			bw.newLine();
			bw.write("Line 3");
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("書き込みに失敗しました。");
			e.printStackTrace();
		}

		// ファイルの読み込み操作
		try (
				// close処理が必要な処理
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);) {
			// ファイルの読み込み
			// 一行ずつ書いた内容を改行の状態でコンソールに出力する
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました。");
			e.printStackTrace();
		}
	}
}
