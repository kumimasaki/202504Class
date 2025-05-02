package jdbc_ex2;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.postgresql.Driver;

public class JdbcEx2 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		test2();
	}

	/* JDBCの使用手順
	 * １：Driverの登録
	 * ２：DBの接続準備
	 * ３：SQLの実行
	 * ４：接続を切る
	 * */
	public static void test2() {
		// １：Driverの登録
		Driver driver = new Driver();

		// 外部ファイルの読み込み
		String propertyPath = "src/jdbc_ex2/hello.properties";
		// 外部ファイルの内容を取得
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(propertyPath));
		} catch (IOException e) {
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
		try (
				// 接続情報を作る
				Connection con = driver.connect(url, info);
				// SQLの実行
				// 準備
				Statement smt = con.createStatement();) {
			// SQL文の作成
			String sql = "SELECT * FROM student";
			// 実行⇒結果を取得
			ResultSet rs = smt.executeQuery(sql);

			// すべてのデータを出力（id, name, score）
			while (rs.next()) {
				System.out.println("id：" + rs.getInt("id") +
						" name：" + rs.getString("name") +
						" score：" + rs.getInt("score"));
			}

		} catch (SQLException e) {
			System.out.println("データベースのアクセス失敗");
			e.printStackTrace();
		}

	}

}
