package chap10.exericse;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.set(2020,0,1);
		c2.set(2020,0,1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date day1 = c1.getTime();
		System.out.println(sdf.format(day1));
		Date day2 = c2.getTime();
		System.out.println(sdf.format(day2));
		
		if(c1.equals(c2))
			System.out.print("�̰� ����");
		else
			System.out.print("�ٸ���");
	}
	
	
	Calendar c = Calendar.getInstance();


}
