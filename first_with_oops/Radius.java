/** WAP that accepts radius of a circle and display its area and circumference. */
import java.util.Scanner;  //Scanner class called from util pacakage
class Radius {
	//Data
	protected float radius; //protected used for security and resablity
	protected float area = 0; //inital value assigned to the variable that is to be calculated
	protected float cir = 0;
	//constructors
	public Radius() { 
	}
	public Radius(int radius) {  //constructor with arguments
		this.radius = radius;
	}
	//Data behaviour
	public float getRadius() {
		return radius;   //returns float value
	}
	public void setRadius(float radius) {
		this.radius = radius;  //this refers to member data
	}
	public void showData() {
		System.out.println("Radius: " + radius);
	} 
	public void acceptData() {
		Scanner radius = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		this.radius = radius.nextFloat();
	}
	//Operations
	public float getArea() {
		return (float)(Math.PI*(Math.pow(radius,2))); //Math.PI is of double type
	}
	public float getPer() {
		return (float)(2*Math.PI*radius); //Math class of called from lang pacakage
	} 
	public static void main(String args[]) {
		Radius r = new Radius();
	       	r.acceptData();
		r.showData();
		System.out.println("Area: " + r.getArea() + "\nCircumference: " + r.getPer());	
		/*
		Radius r1 = new Radius();
		r1.setRadius(4.5f);
		System.out.println("For radius: " + r1.getRadius());
		System.out.println("Area: " + r1.getArea() + "\nCircumference: " + r1.getPer());
		Radius r2 = new Radius(7);
		System.out.println("Radius: " + r2.getRadius() + "\nArea: " + r2.getArea() + "\nPerimeter: " +r2.getPer());
		*/
	}
}
