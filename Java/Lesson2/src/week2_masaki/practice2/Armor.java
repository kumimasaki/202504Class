package week2_masaki.practice2;

public class Armor implements Item{
	//メンバ変数
	// アーマーの名前
	private String name;
	// アーマーの守備力
	private int defenceValue;
	
	// コンストラクタ
	public Armor(String name, int defenceValue) {
		this.name = name;
		this.defenceValue = defenceValue;
	}

	// ゲッター
	public String getName() {
		return name;
	}

	public int getDefenceValue() {
		return defenceValue;
	}

	// インターフェースのメソッドをオーバーライド
	// アイテム使用メソッド
	@Override
	public void use() {
		System.out.println(name + "を身に着けた");
		System.out.println("守備力が" + defenceValue + "上がった");
	}
	
}
