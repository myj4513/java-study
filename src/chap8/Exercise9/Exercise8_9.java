package chap8.Exercise9;

public class Exercise8_9 {

	public static void main(String[] args) {
		UnsupportedFunctionException e = new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}

}

class UnsupportedFunctionException extends RuntimeException{
	private final int ERR_CODE;
	
	UnsupportedFunctionException(String msg, int errCode){
		super(msg);
		this.ERR_CODE = errCode;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}