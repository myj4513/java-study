package chap10.exericse;

import java.util.*;
import java.text.*;
public class Exercise10_7 {

	public static void main(String[] args) {//Date로 만들어서 set을 쓰는 방법은 없는건가
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.set(2016,11, 1);
		c2.set(2016,11, 31);
		
		for(;c1.before(c2);c1.add(Calendar.DATE, 1)) {
			if(c1.get(Calendar.DAY_OF_WEEK_IN_MONTH)==4&& c1.get(Calendar.DAY_OF_WEEK)==3) {
				Date d = c1.getTime();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				System.out.println(sdf.format(d));
				
			}
		}
		
	}

}
