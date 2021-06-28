package chap10.exericse;

import java.text.*;
import java.util.*;

public class Exercise10_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
		System.out.print(">>");
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		while(s.hasNextLine()) {
			try {
				date = sdf.parse(s.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
				System.out.print(">>");
			}
		}
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
		System.out.println(sdf2.format(date));
		
		
	}

}
