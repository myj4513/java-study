package chap7.practice31;

public class InnerEx1 {
	class InstanceInner{
		int iv = 100;
		//static int cv = 100; �� ���� Ŭ������ �ν��Ͻ� Ŭ�����̹Ƿ� �ν��Ͻ������ ���õ� �۾��� ���Ǿ�� ��
		final static int CONST = 100; //final static�� ����̹Ƿ� ���
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