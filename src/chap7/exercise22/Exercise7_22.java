package chap7.exercise22;

public class Exercise7_22 {
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for(Shape shape : arr) {
			sum += shape.calcArea();
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
	}

}

class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle(double width, double height){
		this(new Point(), width, height);
	}
	
	Rectangle(Point p, double width, double height){
		super(p);
		this.width = width;
		this.height = height;
	}
	
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		if(width == height) return true;
		else return false;
	}
}

class Circle extends Shape{
	double r;
	
	Circle(double r){
		this(new Point(), r);
	}
	
	Circle(Point p, double r){
		super(p);
		this.r = r;
	}
	
	double calcArea() {
		return Math.PI * r * r;
	}
}

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point());
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point{
	int x, y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+this.x+","+this.y+"]";
	}
}