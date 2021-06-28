package chap6.practice5;


class Card{
	String kind;
	int number;
	
	static int height = 250;
	static int width = 100;
}

public class CardTest {
	public static void main(String[] args) {
		System.out.printf("Card.width = %d\n", Card.width);
		System.out.printf("Card.height = %d\n", Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1은 %s, %d이며, 크기는 (%d, %d)\n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2은 %s, %d이며, 크기는 (%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);
		
		c1.height = 50;
		c1.width = 80;
		
		System.out.printf("c1은 %s, %d이며, 크기는 (%d, %d)\n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2은 %s, %d이며, 크기는 (%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);
	}
}
