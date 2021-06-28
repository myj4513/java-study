package chap10.practice2;

import java.util.*;

public class CalendarEx2 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2015, 7, 15);
		System.out.println("date1은 "+toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
		System.out.println("오늘(date2)는 "+toString(date2)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
		
		long difference = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("그날부터 지금까지"+difference+"초가 지났습니다.");
		System.out.println("일(day)로 계산하면"+ difference/(60*60*24)+"일입니다.");
		System.out.println("연(year)로 계산하면"+ difference/(60*60*24*365)+"년입니다.");
	}
	
	public static String toString(Calendar c) {
		return c.get(Calendar.YEAR)+"년"+(c.get(Calendar.MONTH)+1)+"월"+c.get(Calendar.DATE)+"일 ";
	}

}
