package chap7.exercise14;

public class Exercise7_14 {

	public static void main(String[] args) {
		SutdaCard card = new SutdaCard(1, true);
	}

}

class SutdaCard{
	final int NUM;
	final boolean ISKWANG;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.NUM = num;
		this.ISKWANG = isKwang;
	}
	
	public String toString() {
		return NUM + (ISKWANG?"K":"");
	}
}