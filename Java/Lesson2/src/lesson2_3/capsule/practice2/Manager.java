package lesson2_3.capsule.practice2;

public class Manager extends Employee{
	// メンバ変数
	private String department;

	// コンストラクタ
	public Manager(String name, int employeeID, double salary, String department) {
		super(name, employeeID, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}
	
}
