package jdbc_ex1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.postgresql.Driver;

public class JdbcEx {

	public static void main(String[] args) throws SQLException {
		// メソッドの呼び出し
		test1();
	}
	
	/* JDBCの使用手順
	 * １：Driverの登録
	 * ２：DBの接続準備
	 * ３：SQLの実行
	 * ４：接続を切る
	 * */
	public static void test1() throws SQLException {
		// １：Driverの登録
		Driver driver = new Driver();
		
		// ２：DBの接続準備
		// リンクの作成
		String url = "jdbc:postgresql://localhost:5433/hello";
		// DBに接続するための設定情報 ユーザ名やパスワードを設定
		Properties info = new Properties();
		// ユーザー名の設定
		info.setProperty("user", "postgres");
		// パスワードの設定
		info.setProperty("password", "123456");
		// 接続情報を作る
		Connection con = driver.connect(url, info);
		
		// ３：SQLの実行
		// 準備
		Statement smt = con.createStatement();
		// SQL文の作成
		String sql = "SELECT * FROM student";
		// 実行⇒結果を取得
		ResultSet rs = smt.executeQuery(sql);
		
		// すべてのデータを出力（id, name, score）
		while(rs.next()) {
			System.out.println("id：" + rs.getInt("id") +
								" name：" + rs.getString("name") + 
								" score：" + rs.getInt("score"));
		}
		
		// ４：接続を切る
		smt.close();
		con.close();
	}

	
	
	
	
	
	
	
	
	
	
}
