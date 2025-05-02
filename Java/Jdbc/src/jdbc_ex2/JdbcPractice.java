package jdbc_ex2;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.postgresql.Driver;

public class JdbcPractice {

	public static void main(String[] args) {
		// practiceメソッドの呼び出し
		pokemon();
	}
	
    // Hello倉庫の中のポケモンテーブルから全てのデータを抽出して出力してください
	// 既存の.propertiesファイルを使うこと
	// practiceメソッドを作成
	
	//	⇒出力結果
	//	id:37,name:Vulpix,type_id:10
	//	id:46,name:Paras,type_id:7
	//	id:133,name:Eevee,type_id:1
	public static void pokemon() {
		// 1:ドライバの登録
		Driver driver = new Driver();
		// 外部ファイルの読み込み
		String propertyPath = "src/jdbc_ex2/hello.properties";
		
		// 外部ファイルの内容を取得
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(propertyPath));
		} catch(IOException e) {
			System.out.println("ファイルの読み込みに失敗しました");
			e.printStackTrace();
		}
		
		// URLの設定
		String url = properties.getProperty("url");
		// DBに接続するための設定情報
		Properties info = new Properties();
		// ユーザー名の設定
		info.setProperty("user", properties.getProperty("user"));
		// パスワードの設定
		info.setProperty("password", properties.getProperty("password"));

		// try-with-resource
		try(
				// 接続情報を作る
				Connection con = driver.connect(url, info);
				// SQLの実行準備
				Statement smt = con.createStatement();
		){
			// データの一覧を取得
			String sql = "SELECT * FROM pokemon";
			// 実行⇒結果を取得
			ResultSet rs = smt.executeQuery(sql);
			
			// すべてのデータを出力
			while(rs.next()) {
				System.out.println("id:" + rs.getInt("id") + 
				", name:" + rs.getString("name") + 
				", type_id:" + rs.getInt("type_id"));
			}
		} catch (SQLException e) {
			System.out.println("データベースのアクセス失敗");
			e.printStackTrace();
		}
	}
}
