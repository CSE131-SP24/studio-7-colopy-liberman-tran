package studio7;

import java.util.Scanner;

public class Rectangle {
	
	static Scanner scan = new Scanner(System.in);
	
	private double width;
	private double height;
	
	private Rectangle(double initWidth, double initHeight) {
		width = initWidth;
		height = initHeight;
		
	}
	
	public double area() {
		double area = this.width * this.height;
		
		return area;
	}
	
	public double perimeter() {
		double perim = 2.0 * this.width + 2.0 * this.height;
		
		return perim;
	}
	
	public boolean compare(Rectangle rect1) {
		
		boolean isSmaller = this.area() < rect1.area();
		
		return isSmaller;
	}
	
	public boolean square() {
		boolean isSquare = this.width == this.height;
		
		return isSquare;
	}
	
	public String toString(Rectangle rect1) {
		String string = this.area() + ", " + this.perimeter() + ", " + this.square() + ", " + compare(rect1);
		
		return string;
	}
	
	public static void main(String[] args) {
		double width = scan.nextDouble();
		double height = scan.nextDouble();
		
		Rectangle rect1 = new Rectangle(width, height);
		
		width = scan.nextDouble();
		height = scan.nextDouble();
		
		Rectangle rect2 = new Rectangle(width, height);
		
		String print = rect1.toString(rect2);
		System.out.println(print);
	}

}
