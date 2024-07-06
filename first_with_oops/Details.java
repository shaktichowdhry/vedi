/** WAP that accepts your name,address and mobile number and display it on screen. */
import java.util.Scanner;  //Scanner class called from util package 
class Details {
	//Data members
	protected String name;
	protected String address;
	protected long num;  //out of range with integer data type
	//constructor
	public Details() {
	}
	public Details(String name, String address, long num ) { //constructor with arguments
		this.name = name;
		this.address = address;
		this.num = num;
	}
	//Data behaviour
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public long getNum() {
		return num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public void acceptData() {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your name:");
		this.name = name.nextLine();
		Scanner address = new Scanner(System.in);
		System.out.println("Enter your address:");
		this.address = address.nextLine();
		Scanner num = new Scanner(System.in);
		System.out.println("Enter your mobile number:");
		this.num = num.nextLong();
	}
	public void showData() {
		System.out.println("Your Details are as follows");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Mobile number: " + num);
	}
	//main method
	public static void main(String args[]) {
		Details d = new Details();
		d.acceptData();
		d.showData();
		/*
		Details d1 = new Details();
		d1.setName("Shakti");
		d1.setAddress("369/3 shakti nagar, bhopal.");
		d1.setNum(9876543468l);
		System.out.println("Name: " + d1.getName() + "\nAddress: " + d1.getAddress() + "\nMobile number: " + d1.getNum());
		Details d2 = new Details("Abhiraj", "567/1 shakti nagar, bhopal.", 674554347l);
		System.out.println("Name: " + d2.getName() + "\nAddress: " + d2.getAddress() + "\nMobile number: " + d2.getNum());
		*/
	}


}
