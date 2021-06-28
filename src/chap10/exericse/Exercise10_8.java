package chap10.exericse;

import java.time.*;

public class Exercise10_8 {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		ZoneId zid1 = ZoneId.of("Asia/Seoul");
		ZoneId zid2 = ZoneId.of("America/New_York");
		ZonedDateTime zdt1 = ldt.atZone(zid1);
		ZonedDateTime zdt2 = ldt.atZone(zid2);
		
		System.out.println(zdt1);
		System.out.println(zdt2);
		
		Duration du = Duration.between(zdt1, zdt2);
		LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		System.out.println("diff="+tmpTime.getHour()+" hrs");
	}

}
