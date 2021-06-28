package chap7.practice33;

public class InnerEx3 {

	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		//int siv = outerIv;  스태틱 내부 클래스는 외부 클래스의 인스턴스멤버에 접근할수 없다.
		int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;  //jdk1.8부터 에러아님
			int liv4 = LV;
		}
	}

}
