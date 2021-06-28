package chap8.practice12;

public class ExceptionEx12 {

	public static void main(String[] args) {
		method1();
		System.out.println(1);
	}
	
	static void method1(){
		method2();
	}
	
	static void method2(){
		throw new RuntimeException();
	}

}
