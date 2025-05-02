package sql_injection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.Driver;

public class SQLNoInjection {
	public static void main(String[] args) {
		test1("Alice");
		test1("Dave");
		// SQL インジェクション
		test1("'; UPDATE account SET password = 'HACKED' --");
	}
	
	// SQLインジェクションを起こさないメソッド
	public static void test1(String username) {
		//1:ドライバの登録
        Driver driver = new Driver();
        //ファイルのパスの設定
		String propertyPath = "src/sql_injection/jdbc.properties";
		//2:DBの接続準備
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(propertyPath));
        } catch (IOException e) {
            System.err.println("Failed to read the property file: " + propertyPath);
            e.printStackTrace();
            return;
        }
        //データベースのアドレスの設定
        String url = properties.getProperty("url");
        Properties info = new Properties();
        info.setProperty("user", properties.getProperty("user"));
        info.setProperty("password", properties.getProperty("password"));

        // 実行したいSQL文の作成
        String sql = "SELECT password FROM account WHERE username = ?";
        
        // try-width-resourceを使ってSQLの実行
        try(
        		// リンクの作成
        		Connection con = driver.connect(url, info);
        		// SQLインジェクション回避の設定
        		PreparedStatement smt = con.prepareStatement(sql);
        ){
        	// 「?」に値を設定
        	smt.setString(1, username);
        	// 実行⇒結果を取得
        	ResultSet rs = smt.executeQuery();
        	
        	if (rs.next()) {
                System.out.println("The password of " + username + " is '" + rs.getString("password") + "'.");
            } else {
                System.out.println("There is no user called '" + username + "'.");
            }
        	
        } catch (SQLException e) { 
        	// データベース操作時の例外処理
            System.err.println("Error happened when I try to access the database: " + properties.getProperty("url"));
            e.printStackTrace();
        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
