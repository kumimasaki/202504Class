package lesson2_3.capsule.practice4;

public class Cooler {
	// メンバ変数
	// 現在の温度
	protected int nowTemp;
	// 目標である温度
	protected int goalTemp;
	
	// コンストラクタ
	public Cooler(int nowTemp) {
		this.nowTemp = nowTemp;
	}

	// 目標の室温を設定するメソッド
	public void setGoalTemp(int goalTemp) {
		this.goalTemp = goalTemp;
	}
	
	// 冷却処理を行うメソッド
	public void adjust() {
		if(nowTemp > goalTemp) {
			nowTemp--;
			System.out.println("室温を1°下げました。");
		} else {
			System.out.println("適温です。");
		}
	}
}
