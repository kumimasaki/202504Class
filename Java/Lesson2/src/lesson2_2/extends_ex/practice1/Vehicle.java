package lesson2_2.extends_ex.practice1;

//スーパークラス（親クラス）
public class Vehicle {
	// メンバ変数
	String brand;

	// コンストラクタ
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	// ブランド名表示メソッド
	void displayBrand() {
		System.out.println(brand);
	}
}
