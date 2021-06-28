package chap10.exericse;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.set(2010, 0, 1);
		to.set(2010, 11, 31);
		for(;from.before(to);from.add(Calendar.DATE,1)) {
			if(from.get(Calendar.DAY_OF_WEEK)==1 && from.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2) {
				Date day = from.getTime();
				System.out.println(sdf.format(day));
			}
		}
		
	}
}
