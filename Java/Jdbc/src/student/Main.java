package student;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成
		StudentDao dao = new StudentDaoImpl();
		
		// saveメソッドの呼び出し
		System.out.println(dao.save(new StudentDto(1, "Alice", 19, "Java", "Female")));
		
		// findAllメソッドの呼び出し
//		List<StudentDto> result = new ArrayList<>();
//		result = dao.findAll();
		for(StudentDto dto : dao.findAll()) {
			System.out.println(dto);
		}
		
		// DBとの接続を切る
		dao.close();
	}

}
