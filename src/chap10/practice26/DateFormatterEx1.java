package chap10.practice26;

import java.time.*;
import java.time.format.*;

public class DateFormatterEx1 {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		
		String[] patterns = {
				"yyyy-MM-dd HH:mm:ss",
				"''yy�� MMM dd�� E����",
				"yyyy-MM-dd HH:mm:ss.SSS Z VV",
				"yyyy-MM-dd hh:mm:ss a",
				"������ �� ���� D��° ���Դϴ�.",
				"������ �� ���� d��° ���Դϴ�.",
				"������ �� ���� w��° ���Դϴ�.",
				"������ �� ���� W��° ���Դϴ�.",
				"������ �� ���� W��° E�����Դϴ�."
		};
		for(int i=0;i<patterns.length;i++) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(patterns[i]);
			System.out.println(dtf.format(zdt));
		}
	}

}
