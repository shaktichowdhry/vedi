/** WAP that accepts an integer and display the number of digits in that integer. */
import java.util.Scanner;
class Count {
	//Data
	protected int num;
	protected int st; //to avoid changing original vale of num
	protected int count = 0;
	//constructors
	public Count() {
	}
	public Count(int num) {
		this.num = num; 
	}
	//data behaviour
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void acceptData() {
		System.out.println("Enter an integer number: ");
		Scanner num = new Scanner(System.in);
	       	this.num = num.nextInt();	
	}
	public void showData() {
		System.out.println("Entered number is: " + num);
	}
	//operations
	public int getDigits() {
		for(st = num; st>0; count++) {
			st = (int)(st/10); //10 is double type
		}
		return count;
	}
	//main method
	public static void main(String args[]) {
		Count c = new Count();
		c.acceptData();
		System.out.println("Number of digits in " + c.num + " is: " + c.getDigits());
		/*
		Count c1 = new Count();
		c1.setNum(123);
		System.out.println("Number of digits in " + c1.getNum() + "is: " + c1.getDigits());
		Count c2 = new Count(45);
		System.out.println("Number of digits: " + c2.getDigits());
		*/
	}

}
