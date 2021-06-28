package chap10.practice27;

import java.time.*;
import java.time.format.*;

public class DateFormatterEx2 {

	public static void main(String[] args) {
		LocalDate newYear = LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate date = LocalDate.parse("1998-10-02");
		LocalTime time = LocalTime.parse("23:59:59");
		LocalDateTime dateTime = LocalDateTime.parse("1998-10-02T23:59:59");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println(dateTime.format(dtf));
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
	
	}

}
