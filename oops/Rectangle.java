/**
 * Create a class Rectangle derived from Point class
 * Apart fromdata of Point class, Rectangleshould store itswidth and height
 * Write constructors, getter/setters, behaviour, and operations that accepts and displaythe data
 * Also write method that return its area and perimeter
 * Test the class by creating an implementation program
 */ 
import java.util.Scanner;
class Rectangle extends Point {
	protected float width;
	protected float height;
	public Rectangle() {
	}
	public Rectangle(float width, float height) {
		this.height = height;
		this.width = width;
	}
	public void setH(float height) {
		this.height = height;
	}
	public float getH() {
		return height;
	}
	public void setW(float width) {
		this.width = width;
	}
	public float getW() {
		return width;
	}
	public void acceptData() {
		System.out.print("Enter height: ");
		Scanner in = new Scanner(System.in);
		this.height = in.nextFloat();
		System.out.print("Enter width: ");
		this.width = in.nextFloat();
	}
	public void showData() {
		System.out.println("Value of height: " + height);
		System.out.println("Value of width: " + width);
	}
	public float getArea() {
		return height*width;
	}
	public float getPer() {
		return (float)2*(height+width);
	}
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.acceptData();
		System.out.println("Area: " + r.getArea() + "\nPerimeter: " + r.getPer());
	}
}
