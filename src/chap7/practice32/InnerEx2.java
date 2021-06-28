package chap7.practice32;

public class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	//인스턴스와 static 멤버간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		
		//InstanceInner obj1 = new InstanceInner(); static멤버는 인스턴스 멤버에 직접 접근할 수 없다.
		StaticInner obj2 = new StaticInner();
		
		
		//굳이 사용하려면 아래와 같이 객체를 생성해야함
		//인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		//인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능하다.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//LocalInner lv = new LocalInner(); 메서드 내에 지역적으로 선언 되었으므로 내부 클래스 외부에서는 사용 불가
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}

}
