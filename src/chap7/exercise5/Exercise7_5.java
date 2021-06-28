package chap7.exercise5;

public class Exercise7_5 {

	public static void main(String[] args) {
		Tv t = new Tv();
	}

}

class Product{
	int price;
	int bonusPoint;
	
	Product(){};
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){};
	
	public String toString() {
		return "Tv";
	}
}