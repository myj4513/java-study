package chap8.practice17;

public class FinallyTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		} catch(Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		/* ���α׷� ��ġ �ڵ�*/
	}
	
	static void copyFiles() {/*���� �����ϴ� �ڵ�*/}
	static void deleteTempFiles() {/*���� �����ϴ� �ڵ�*/}

}
