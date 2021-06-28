package chap9.Exercise;

public class Exercise9_6 {
	public static String fillZero(String src, int length) {
		if(src==null || length == src.length())
			return src;
		else if(length<=0)
			return "";
		else if(src.length()<length) {
			char[] newStr = new char[length];
			
			for(int i=0;i<length;i++) {
				newStr[i] = '0';
			}
			
			for(int i=0;i<src.length();i++) {
				newStr[length-src.length()+i] = src.charAt(i);
			}
			return new String(newStr);
		}
		else {
			return src.substring(0,length);
		}
		
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}

}
