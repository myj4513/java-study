package chap10.exericse;

import java.text.*;
import java.util.*;

public class Exercise10_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է¿�:2007/05/11)");
		System.out.print(">>");
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		while(s.hasNextLine()) {
			try {
				date = sdf.parse(s.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է¿�:2007/05/11)");
				System.out.print(">>");
			}
		}
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("�Է��Ͻ� ��¥�� E�����Դϴ�.");
		System.out.println(sdf2.format(date));
		
		
	}

}
