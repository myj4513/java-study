package chap7;

public class practice22_PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		
		b.buy(new Tv6());
		b.buy(new Computer2());
		b.buy(new Audio1());
		b.summary();

	}

}

class Product1{
	int price;
	int bonusPoint;
	
	Product1(int price){
		this.price=price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product1(){}
}

class Tv6 extends Product1{
	Tv6(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product1{
	Computer2(){
		super(200);
	}
	public String toString() {
		return "Computer"; 
	}
}

class Audio1 extends Product1{
	Audio1(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer1{
	int money = 1000;
	int bonusPoint = 0;
	Product1[] item = new Product1[10];
	int i=0;
	
	void buy(Product1 p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {
		int sum = 0;
		String itemList ="";
		
		for(int i=0;i<item.length;i++) {
			if(item[i]==null) {
				break;
			}
			
			sum+=item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �Ѿ��� "+sum+"�� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
	}
}