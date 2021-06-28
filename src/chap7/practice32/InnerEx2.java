package chap7.practice32;

public class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	//�ν��Ͻ��� static ��������� ���� ���� ������ �����ϴ�.
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		
		//InstanceInner obj1 = new InstanceInner(); static����� �ν��Ͻ� ����� ���� ������ �� ����.
		StaticInner obj2 = new StaticInner();
		
		
		//���� ����Ϸ��� �Ʒ��� ���� ��ü�� �����ؾ���
		//�ν��Ͻ� Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� ������ �� �ִ�.
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		//�ν��Ͻ��޼��忡���� �ν��Ͻ������ static��� ��� ���� �����ϴ�.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//LocalInner lv = new LocalInner(); �޼��� ���� ���������� ���� �Ǿ����Ƿ� ���� Ŭ���� �ܺο����� ��� �Ұ�
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}

}
