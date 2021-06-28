package chap10.practice21;

import java.util.*;
import java.text.*;
import java.io.*;

public class MessageFormatEx4 {

	public static void main(String[] args) throws Exception {
		String tableName = "CUST_INFO";
		String fileName = "data4.txt";
		String msg = "INSERT INTO "+" VALUES ({0},{1},{2},{3});";
		
		Scanner scanner = new Scanner(new File(fileName));
		
		String pattern = "{0},{1},{2},{3}";
		MessageFormat mf = new MessageFormat(pattern);
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(MessageFormat.format(msg, objs));
		}
		scanner.close();
	}
}
