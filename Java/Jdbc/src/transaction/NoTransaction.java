package transaction;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.Driver;
public class NoTransaction {
	public static void main(String[] args) {
		// トランザクションを使用しない
		noTransaction();
	}

	/**
	 * トランザクションを利用しない方法。実行した後のデータベースの変更に注意してください。
	 */
	public static void noTransaction() {
		String sql1 = "INSERT INTO account VALUES(?, ?)";
		String sql2 = "UPDATE account SET password=? WHERE username=?";
		String sql3 = "DELETE FROM account WHERE username=?";

		Driver driver = new Driver();
		String propertyPath = "src/transaction/jdbc.properties";

		Properties properties = new Properties();
		try {
			properties.load(new FileReader(propertyPath));
		} catch (IOException e) {
			System.err.println("Failed to read the property file: " + propertyPath + ".");
			e.printStackTrace();
			return;
		}

		String url = properties.getProperty("url");
		Properties info = new Properties();
		info.setProperty("user", properties.getProperty("user"));
		info.setProperty("password", properties.getProperty("password"));

		try (Connection con = driver.connect(url, info);
				PreparedStatement smt1 = con.prepareStatement(sql1);
				PreparedStatement smt2 = con.prepareStatement(sql2);
				PreparedStatement smt3 = con.prepareStatement(sql3);
			) {
			
			// 自動コミット機能をOFFにする
			con.setAutoCommit(false);
			
			try {
				// 第 1 の SQL 文を実行し、データを挿入する
				smt1.setString(1, "Ana");
				smt1.setString(2, "123");
				smt1.executeUpdate();

				int i = 1 / 0; // 例外は発生したが、第 1 のステートメントが完了したため、自動的にデータベースにコミットされてしまった

				// 第 2 の SQL 文を実行し、データを変更する
				smt2.setString(1, "123456");
				smt2.setString(2, "Ana");
				smt2.executeUpdate();

				// 第 3 の SQL 文を実行し、データを削除する
				smt3.setString(1, "Alice");
				smt3.executeUpdate();
				
				// SQL文が問題なく全部実行できたら処理を確定するコミットする
				con.commit();

			} catch (Exception e) { // データベース操作時の例外処理
				System.err.println(
						"Error happened when I try to access the database: " + properties.getProperty("url") + ".");
				e.printStackTrace();
				// 処理を破棄するロールバック処理を行う
				con.rollback();
				System.out.println("ロールバックを実行しました");
			}

		} catch (SQLException e) { // データベースにコネクトする時の例外処理
			System.err.println(
					"Error happened when I try to access the database: " + properties.getProperty("url") + ".");
			e.printStackTrace();
		}

	}
}
