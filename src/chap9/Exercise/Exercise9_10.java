package chap9.Exercise;

public class Exercise9_10 {
	public static String format(String str, int length, int alignment) {
		char[] newStr = new char[length];
		if(length<str.length()) {
			
			for(int i=0;i<length;i++) {
				newStr[i] = str.charAt(i);
			}
			return new String(newStr);
		}else {
			for(int i=0;i<length;i++) {
				newStr[i] = ' ';
			}
			if(alignment == 0) {
				for(int i=0;i<str.length();i++) {
					newStr[i] = str.charAt(i);
				}
			} else if(alignment == 1) {
				for(int i=0;i<str.length();i++) {
					newStr[(length-str.length())/2+i] = str.charAt(i);
				}
			}else if(alignment == 2) {
				for(int i=0;i<str.length();i++) {
					newStr[length-str.length()+i]=str.charAt(i);
				}
			}
			return new String(newStr);
		}
	}
	
	public static void main(String[] args) {
		String str = "°¡³ª´Ù";
		System.out.println(format(str,7,0));
		System.out.println(format(str,7,1));
		System.out.println(format(str,7,2));
	}

}
