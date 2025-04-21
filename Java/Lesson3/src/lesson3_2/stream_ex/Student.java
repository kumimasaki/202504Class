package lesson3_2.stream_ex;

public class Student {
	// メンバ変数
	// 名前：name
	private String name;
	// 点数：score
	private int score;
	
	// コンストラクタ
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// toStringのオーバライド
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}
