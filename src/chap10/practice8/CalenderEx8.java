package chap10.practice8;

public class CalenderEx8 {

	public static void main(String[] args) {
		String date1 = "199706";
		String date2 = "199810";
		
		int month1 = Integer.parseInt(date1.substring(0,4))*12+Integer.parseInt(date1.substring(4));
		System.out.println(month1);
		int month2 = Integer.parseInt(date2.substring(0,4))*12+Integer.parseInt(date2.substring(4));
		System.out.println(month2);
		
		System.out.println("date1과 date2의 달의 차이는"+Math.abs(month1 - month2));
		
	}

}
