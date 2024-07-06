/** WAP that accepts 2 numbers and display their sum, difference, product and quotient. */
import java.util.Scanner;  //util package
class Operations {
	//data
	protected float a; //protected for reusability
	protected float b;
	//constructors
	public Operations() {
	}
	public Operations(float a, float b) {  //constructor with argument
		this.a = a;
		this.b = b;  //this refers to member data
	}
	//data behaviour
	public float getA() {
		return a; 
	}
	public float getB() {
		return b; 
	}
	public void setA(float a) {
		this.a = a;
	}
	public void setB(float b) {
		this.b = b;
	}
	public void acceptData() {
		System.out.println("Enter a number:");
		Scanner a =new Scanner(System.in);
		this.a=a.nextFloat();
		System.out.println("Enter another number:");
		Scanner b =new Scanner(System.in);
		this.b=b.nextFloat();
	} 
	public void showData() {
		System.out.println("Value of a: " + a + "\nValue of b:" + b);
	}
	//operations
	public float getSum() {
		return a+b;
	}
	public float getDif() {
		return a-b;
	}
	public float getMul() {
		return a*b;
	}
	public int getQuo() {
		return (int)(a/b); //quotient only
	}
	//main method
	public static void main(String args[]) {
		Operations o = new Operations();
	       	o.acceptData();
		o.showData();
		System.out.println("Sum: " + o.getSum() + "\nDifference: " + o.getDif() + "\nProduct: " + o.getMul() + "\nQuotient: " + o.getQuo());	
		/*
		Operations o1 = new Operations();
		o1.setA(5);
		o1.setB(10);
		System.out.println("Value of a and b is: " + o1.getA() + o1.getB());
		System.out.println("Sum: " + o1.getSum() + "\nDifference: " + o1.getDif() + "\nProduct: " + o1.getMul() + "\nQuotient: " + o1.getQuo());	
		Operations o2 = new Operations(30, 20);
		System.out.println("Value of a and b is: " + o2.getA() + o2.getB());
		System.out.println("Sum: " + o2.getSum() + "\nDifference: " + o2.getDif() + "\nProduct: " + o2.getMul() + "\nQuotient: " + o2.getQuo());	
		*/
	}
}
