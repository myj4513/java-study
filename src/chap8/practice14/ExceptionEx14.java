package chap8.practice14;

public class ExceptionEx14 {
	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main �޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}
	
	static void method1() throws Exception{
		throw new Exception();
	}
}
