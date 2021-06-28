package chap10.exericse;

import java.util.*;
import java.text.*;

public class Exercise10_6 {

	public static void main(String[] args) throws Exception{
		Scanner s = new Scanner(System.in);
		System.out.print("birth day=");
		String birthDay = s.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
		Date birthDate = sdf.parse(birthDay);
		System.out.println("today    ="+sdf.format(today));
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.setTime(today);
		c2.setTime(birthDate);
		
		long difference = (c1.getTimeInMillis()-c2.getTimeInMillis())/(1000*60*60*24);
		System.out.println(difference+" days");
	}

}
