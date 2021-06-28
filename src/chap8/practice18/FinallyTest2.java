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
		/* 프로그램 설치 코드*/
	}
	
	static void copyFiles() {/*대충 복사하는 코드*/}
	static void deleteTempFiles() {/*대충 삭제하는 코드*/}

}
