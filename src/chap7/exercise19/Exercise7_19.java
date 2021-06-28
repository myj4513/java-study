package chap7.exercise19;

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}

class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� "+p+"��/�� ��� �����ϴ�.");
			return;
		}
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		if(i>=cart.length) {
			Product[] newCart = new Product[cart.length*2];
			System.arraycopy(cart, 0, newCart, 0, cart.length);
			cart = newCart;
		}
		cart[i++] = p;
	}
	
	void summary() {
		int sum = 0;
		System.out.print("������ ����:");
		for(int j=0;j<cart.length;j++) {
			if(cart[j]!=null) {
				System.out.print(cart[j]+",");
				sum += cart[j].price;
			}
		}
		System.out.println();
		System.out.println("����� �ݾ�:"+sum);
		System.out.println("���� �ݾ�:"+money);
	}
}

class Product{
	int price;
	
	Product(int price){
		this.price = price;
	}
}
class Tv extends Product{
	Tv(){
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

class Audio extends Product{
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}