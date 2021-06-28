package chap10.practice15;

import java.util.*;
import java.text.*;

public class DateFormatEx4 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예시: 1998/10/2)");
		while(s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예시: 1998/10/2)");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		
		long day = Math.abs(cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
		System.out.println("차이는:"+day+"시간입니다.");
	}

}
