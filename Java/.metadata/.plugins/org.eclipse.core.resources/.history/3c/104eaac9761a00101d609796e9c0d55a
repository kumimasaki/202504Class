package lesson3_3.file_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice1 {

	public static void main(String[] args) {
		// ファイルクラスを使ってファイルを指定（practice3.txt）
		File file = new File("practice3.txt");
		
		// もしファイルが存在していなかったら、ファイルの作成をする
		// 存在していた場合は、ファイルのサイズを出力する
		if (!file.exists()) {
			// ファイルが存在しない場合
			try {
				// ファイルを作成
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			// ファイルサイズを出力
			System.out.println(file.length());			
		}
		
		// ファイル書き込み操作
		try (
				// close処理が必要な処理
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fileWriter);
		) {
			// 文字列をファイルに書き込む
			//   書き込む内容：寿司、焼肉、ハンバーグ（改行あり）
			bw.write("焼肉");
			// 改行
			bw.newLine();
			bw.write("寿司");
			bw.newLine();
			bw.write("ハンバーグ");
		} catch(FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("書き込みに失敗しました。");
			e.printStackTrace();
		}
		
		// ファイル読み込み操作
		try(
				FileReader fileReader = new FileReader(file);
				BufferedReader br = new BufferedReader(fileReader);
		){
			// ファイルに書いてあるままの内容をコンソールに表示する
			String line = br.readLine();
			while(line != null) {
				// 内容を出力
				System.out.println(line);
				line = br.readLine();
			}
		} catch(FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました。");
			e.printStackTrace();
		}
		
	}

}
