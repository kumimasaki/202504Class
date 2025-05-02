package student;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.postgresql.Driver;

public class StudentDaoImpl implements StudentDao {
	// Driverの設定
	private static final Driver DRIVER = new Driver();
	// ファイルパスの設定
	private static final String PROPERTY_PATH = "src/student/dao.properties";

	private String url = "";
	private String user = "";
	private String password = "";
	private Connection con = null;

	// コンストラクタの作成をしてDB接続情報を記載
	public StudentDaoImpl() {
		// 設定情報（ファイル）の取得
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(PROPERTY_PATH));
		} catch (IOException e) {
			System.out.println("ファイルの読み込みに失敗しました");
			e.printStackTrace();
		}

		url = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");

		Properties info = new Properties();
		// ユーザー名の設定
		info.setProperty("user", user);
		// パスワードの設定
		info.setProperty("password", password);

		try {
			// 接続情報を作る
			con = DRIVER.connect(url, info);
		} catch (SQLException e) {
			System.out.println("データベースのアクセス失敗");
			e.printStackTrace();
		}
	}

	@Override
	public List<StudentDto> findAll() {
		// SQLの作成
		String sql = "SELECT * FROM student";
		List<StudentDto> result = new ArrayList<>();
		try (Statement smt = con.createStatement()) {
			// 実行
			ResultSet rs = smt.executeQuery(sql);
			// resultに取得結果を入れる
			while (rs.next()) {
				result.add(new StudentDto(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getInt("age"),
						rs.getString("subject"),
						rs.getString("gender")));
			}
		} catch (SQLException e) {
			System.out.println("データを取得できませんでした");
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int save(StudentDto studentDto) {
		// SQLの作成
		String sql = "INSERT INTO student VALUES(?,?,?,?,?)";
		int result = 0;
		try(PreparedStatement smt = con.prepareStatement(sql)){
			// 「?」に値を設定
			smt.setInt(1, studentDto.getId());
			smt.setString(2, studentDto.getName());
			smt.setInt(3, studentDto.getAge());
			smt.setString(4, studentDto.getSubject());
			smt.setString(5, studentDto.getGender());
			// 実行
			result = smt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("データを挿入できませんでした");
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void close() {
		// DBとの接続を切る
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("データベースを閉じることができませんでした");
				e.printStackTrace();
			}
		}
	}

}
