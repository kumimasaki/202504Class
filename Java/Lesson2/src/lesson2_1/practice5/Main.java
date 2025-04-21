package lesson2_1.practice5;

public class Main {

	public static void main(String[] args) {
		// 配列を用意
        Student[] students = new Student[2];
        students[0] = new Student("タロウ", 80, 75, 90);
        students[1] = new Student("ハナコ", 90, 70, 80);
        
        // 結果を表示する
        System.out.println("成績表");
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }
        
        for (Student data : students) {
        	data.show();
		}

	}

}
