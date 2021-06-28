package chap10.practice2;

import java.util.*;

public class CalendarEx2 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2015, 7, 15);
		System.out.println("date1�� "+toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"�����̰�,");
		System.out.println("����(date2)�� "+toString(date2)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"�����̰�,");
		
		long difference = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("�׳����� ���ݱ���"+difference+"�ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ�"+ difference/(60*60*24)+"���Դϴ�.");
		System.out.println("��(year)�� ����ϸ�"+ difference/(60*60*24*365)+"���Դϴ�.");
	}
	
	public static String toString(Calendar c) {
		return c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DATE)+"�� ";
	}

}
