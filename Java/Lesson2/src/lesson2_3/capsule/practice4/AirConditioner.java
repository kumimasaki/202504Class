package lesson2_3.capsule.practice4;

public class AirConditioner extends Cooler {

	// コンストラクタ
	public AirConditioner(int nowTemp) {
		super(nowTemp);
	}

	// 冷却処理を行うメソッド
	@Override
	public void adjust() {
		if (nowTemp < goalTemp) {
			nowTemp++;
			System.out.println("室温を1°上げました。");
		} else {
			super.adjust();
		}
	}

}
