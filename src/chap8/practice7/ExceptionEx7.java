package chap8.practice7;

public class ExceptionEx7 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("true");
				System.out.println("ArithmeticException");
			}
		} catch(Exception e) {
			System.out.println("Exception");
		}
	}
}
