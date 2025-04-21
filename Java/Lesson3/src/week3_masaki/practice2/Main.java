package week3_masaki.practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Fileクラスでファイルを指定
		File file = new File("nikujaga.txt");
		
		if(!file.exists()) {
			try {
				// ファイルの作成
				file.createNewFile();
			} catch(IOException e) {
				// どこでエラーが発生したか表示
				e.printStackTrace();
			}
		}
		
		// ファイルの書き込み操作
		try(
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fileWriter)	
		){
			// ファイルへの書き込み
			writer.write("carrot");
			writer.newLine();
			writer.write("potato");
			writer.newLine();
			writer.write("meat");
			writer.newLine();
			writer.write("onion");
		} catch(FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// ファイルの読み込み
		try ( 
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader)
		) {
			// ファイルの読み込み
			String line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch(FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
