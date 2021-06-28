package chap7;

public class practice12_FinalCardTest {
	public static void main(String[] args) {
		Card4 c = new Card4("HEART", 10);
		//c.NUMBER = 5;  에러발생
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}

class Card4{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card4(String kind, int number){
		this.NUMBER = number;
		this.KIND = kind;
	}
	
	Card4(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}