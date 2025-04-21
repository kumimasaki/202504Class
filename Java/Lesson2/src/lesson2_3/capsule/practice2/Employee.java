package lesson2_3.capsule.practice2;

public class Employee {
	// メンバ変数
	private String name;
	private int employeeID;
	protected double salary;
	
	// コンストラクタ
	public Employee(String name, int employeeID, double salary) {
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setSalary(double salary) {
		if(salary >= 0) {
			this.salary = salary;
		}
	}
	
	public void raiseSalary(double amount) {
		if(amount > 0) {
			this.salary += amount;
		}
	}
}
