package chap7.practice31;

public class InnerEx1 {
	class InstanceInner{
		int iv = 100;
		//static int cv = 100; 이 내부 클래스는 인스턴스 클래스이므로 인스턴스멤버와 관련된 작업에 사용되어야 함
		final static int CONST = 100; //final static은 상수이므로 허용
	}
	
	static class StaticInner{
		int iv = 100;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			//static int cv = 300;
			final static int CONST = 300;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}