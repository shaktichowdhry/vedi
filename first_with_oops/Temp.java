/** WAP that accepts temperature in Centigrade and display it in Fahrenheit.*/
import java.util.Scanner;
class Temp {
	//Data
	protected float cen;
	//constructor
	public Temp() {
	}
	public Temp(float cen) {
		this.cen = cen;
	}
	//Data behaviour
	public float getCen() {
		return cen;
	}
	public void setCen(float cen) {
		this.cen = cen;
	}
	public void acceptData() {
		System.out.println("Enter temperature in centigrade:");
		Scanner cen = new Scanner(System.in);
		this.cen = cen.nextFloat();
	}
	public void showData() {
		System.out.println("Temprature in centigrade: " + cen);
	}
	//operations
	public float getFah() {
		return (float)(cen*9/5 +32);
	}
	//main method 
	public static void main(String args[]) {
		Temp t = new Temp();
		t.acceptData();
		System.out.println("Temprature in fahrenheit is: " + t.getFah());
		/*
		Temp t1 = new Temp();
		t1.setCen(32);
		System.out.println("Temprature in centigrade is: " + t1.getCen() + "\nTemprature in fahrenheit: " + t1.getFah());
		Temp t2 = new Temp(0);	
		System.out.println("Temprature in centigrade is: " + t2.getCen() + "\nTemprature in fahrenheit: " + t2.getFah());
		*/
	}
}
