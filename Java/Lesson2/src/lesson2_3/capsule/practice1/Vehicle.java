package lesson2_3.capsule.practice1;

public class Vehicle {
	// メンバ変数
	private String brand;
	protected int speed;
	
	// コンストラクタ
	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void accelerate(int amount) {
		speed += amount; // speed = speed + amount;
	}
	
	public void brake(int amount) {
		speed -= amount; // speed = speed - amount;
	}
	
}
