package chap8.practice18;

public class FinallyTest2 {
	public static void main(String[] args){
		try {
			startInstall();
			copyFiles();
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		/* ���α׷� ��ġ �ڵ�*/
	}
	
	static void copyFiles() {/*���� �����ϴ� �ڵ�*/}
	static void deleteTempFiles() {/*���� �����ϴ� �ڵ�*/}

}
