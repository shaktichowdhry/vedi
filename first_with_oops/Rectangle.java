/** WAP that accepts width and height of a rectangle and display its area and perimeter. */
import java.util.Scanner; //Scanner class called from util package
class Rectangle {
	//Data
	protected float l; //protected used for reusability
	protected float w;
       	//constructors
	public Rectangle() {
	}
	public Rectangle(float l, float w) { //constructor with arguments
		this.l = l;
		this.w = w; //this refers to member data
	}
	//Data behaviour
	public float getL() {
       		return l;
      	}
 	public float getW() {
		return w;
	}	
	public void setL(float l) {
		this.l = l;
	}
	public void setW(float w) {
		this.w = w;
	}
	public void getData() {
		Scanner l = new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
		this.l = l.nextFloat();
		Scanner w = new Scanner(System.in);
		System.out.println("Enter width of rectangle:");
		this.w = w.nextFloat();
	}
	public void showData() {
		System.out.println("Lenght: " + l);
		System.out.println("Width: " + w);
	}
	public float calArea() {
		return l*w;
	} 
	public float calPerimeter() {
		return 2*(l+w);
	}
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.getData();
		r.showData();
		System.out.println("Area: " + r.calArea() + "\nPerimeter: " + r.calPerimeter());
		/*
		Rectangle r1 = new Rectangle();
		r1.setL(10);
		r1.setW(20);
		System.out.println("\nLength: " + r1.getL() + "\nWidth: " + r1.getW());
		System.out.println("Area: " + r1.calArea() + "\nPerimeter: " + r1.calPerimeter());
		Rectangle r2 = new Rectangle(5, 7);
		System.out.println("\nLength: " + r2.l + "\nWidth: " + r2.w);
		System.out.println("Area: " + r2.calArea() + "\nPerimeter: " + r2.calPerimeter());
		*/
	}
}
