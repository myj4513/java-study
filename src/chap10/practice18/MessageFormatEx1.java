package chap10.practice18;

import java.text.*;

public class MessageFormatEx1 {

	public static void main(String[] args) {
		String msg = "Name: {0} \nTel: {1} \nAge:{2} \nBirthday:{3}";
		
		Object[] arguments = {"���ڹ�", "02-123-4567", "27","07-09"};
		
		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
	}

}
