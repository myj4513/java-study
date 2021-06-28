package chap7;

public class practice14_SingletonTest {

	public static void main(String[] args) {
		//Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
	}

}

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(s==null)
			return new Singleton();
		else return s;
	}
}