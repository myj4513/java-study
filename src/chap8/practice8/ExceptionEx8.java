package chap8.practice8;

public class ExceptionEx8 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				//ae.printStackTrace();
				System.out.println("예외메시지:"+ae.getMessage());
			}
		}
	}
}
