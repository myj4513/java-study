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
		/* 프로그램 설치 코드*/
	}
	
	static void copyFiles() {/*대충 복사하는 코드*/}
	static void deleteTempFiles() {/*대충 삭제하는 코드*/}

}
