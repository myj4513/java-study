package chap7.exercise2;

public class Exercise7_2 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0;i<deck.CARD_NUM;i++) {
			System.out.print(deck.cards[i]+",");
		}
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num+(isKwang?"K":"");
	}
}

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<CARD_NUM;i++) {
			int num = i%10+1;
			boolean isKwang = (i<10)&&(num==1 || num==3 || num==8)?true:false;
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	void shuffle() {
		for(int i=0;i<CARD_NUM;i++) {
			int j=(int)(Math.random()*CARD_NUM);
			
			SutdaCard tmp = cards[j];
			cards[j] = cards[i];
			cards[i] = tmp;
			
		}
	}
	
	SutdaCard pick(int index) {
		if(index<0 && index >= CARD_NUM) {
			return null;
		}else {
			return cards[index];
		}
	}
	
	SutdaCard pick() {
		return pick((int)(Math.random()*CARD_NUM));
	}
}