package student;

import java.util.List;

public interface StudentDao {
	// データを全件取得するメソッド
	List<StudentDto> findAll();
	// データを挿入するメソッド(保存)
	int save(StudentDto studentDto);
	// DBからの接続を切るメソッド
	void close();
}
