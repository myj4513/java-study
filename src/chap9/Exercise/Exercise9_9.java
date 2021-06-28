package chap9.Exercise;

public class Exercise9_9 {
	public static String delChar(String str, String delCh) {
		StringBuffer sb = new StringBuffer(str.length());
		
		for(int i=0;i<str.length();i++) {
			if(delCh.indexOf(str.charAt(i))==-1)
				sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+"->"+delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2      3   4\t5)"+"->"+delChar("(1 2      3   4\t5)"," \t"));
	}

}
