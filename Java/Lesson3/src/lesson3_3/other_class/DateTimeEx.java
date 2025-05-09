package lesson3_3.other_class;

import java.time.LocalDateTime;

public class DateTimeEx {

	public static void main(String[] args) {
		// 今日の日付・時刻を取得
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 曜日の取得
		System.out.println(now.getDayOfWeek());
		
		// 日付を足す
		now = now.plusDays(70);
		System.out.println(now);
	}
}
