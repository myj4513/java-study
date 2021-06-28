package chap7.exercise26;

public class Exercise7_26 {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		System.out.println(inner.iv);
	}
}

class Outer{
	static class Inner{
		int iv = 200;
	}
}