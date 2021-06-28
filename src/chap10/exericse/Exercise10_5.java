package chap10.exericse;

import java.util.*;
import java.text.*;

public class Exercise10_5 {
	public static int getDayDiff(String to, String from)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date d1 = null;
		Date d2 = null;
		try {
			d1 = sdf.parse(to);
			d2 = sdf.parse(from);
		} catch(Exception e) {
			return 0;
		}
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);
		long difference = (c1.getTimeInMillis() - c2.getTimeInMillis())/(1000*60*60*24);
		return (int)difference;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103","20010101"));
		System.out.println(getDayDiff("20010103","20010103"));
		System.out.println(getDayDiff("20010103","200103"));
	}

}
