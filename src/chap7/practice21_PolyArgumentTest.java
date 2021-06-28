package chap7;

public class practice21_PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv5());
		b.buy(new Computer());
		
		System.out.println("현재 남은 잔액:"+b.money);
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"입니다.");
	}

}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv5 extends Product{
	Tv5(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money=1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구입하셨습니다.");
	}
}
