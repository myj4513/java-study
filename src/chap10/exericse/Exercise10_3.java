package chap10.exericse;

import java.text.DecimalFormat;

public class Exercise10_3 {

	public static void main(String[] args) throws Exception{
		String str = "123,456,789.5";
		DecimalFormat df = new DecimalFormat("#,###");
		DecimalFormat df1 = new DecimalFormat("#");
		DecimalFormat df2 = new DecimalFormat("#,####");
		
		System.out.println("data:"+str);
		System.out.println("반올림:"+df1.format(df.parse(str)));
		System.out.println("만단위:"+df2.format(df.parse(str)));
	}

}
