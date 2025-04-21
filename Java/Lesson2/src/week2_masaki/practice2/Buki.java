package week2_masaki.practice2;

public class Buki implements Item{
	// メンバ変数
	// 武器の名前
	private String name;
	// 武器の攻撃力
	private int attackValue;
	
	// コンストラクタ
	public Buki(String name, int attackValue) {
		this.name = name;
		this.attackValue = attackValue;
	}

	// ゲッター
	public String getName() {
		return name;
	}

	public int getAttackValue() {
		return attackValue;
	}

	// インターフェースのメソッドをオーバーライド
	// アイテム使用メソッド
	@Override
	public void use() {
		System.out.println(name + "でこうげき!");
		System.out.println("敵に" + attackValue + "のダメージ!");
	}
	
}