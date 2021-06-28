package chap10.practice14;

import java.util.*;
import java.text.*;

public class DateFormatEx3 {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("1998�� 10�� 2��");
			System.out.println(df2.format(d));
		} catch(Exception e) {}
	}

}
