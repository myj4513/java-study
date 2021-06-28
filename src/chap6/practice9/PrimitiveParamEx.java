package chap6.practice9;

class Data{ int x;}

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+ d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = "+x);
	}
}
