package chap8.practice13;

public class ExceptioinEx13 {

	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1���� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}

}
