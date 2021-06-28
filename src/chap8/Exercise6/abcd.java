package chap8.Exercise6;

public class abcd {

	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {
			System.out.println(11);
		}
	}
	
	static void method1() {
		throw new RuntimeException();
	}
}
