package chap8.practice9;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻�������");
			throw e;
			//throw new Exception("���Ƿ� �߻�������"); --�� ������ ���ٷ� ���� �� �ִ�.
		} catch(Exception e) {
			System.out.println("���� �޽���:"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
	}
}
