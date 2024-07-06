/** WAP that accepts a character and print whether it is an uppercase, lowercase, digit or a special character. */ 
import java.util.Scanner;  //util package called
class Character {
	//data
	protected String s;
	protected static int count = 0;  //to count number of characters
	protected char ch;
	//constructor
	public Character() {
	}
	public Character(String s) { //constructor with arguments
		this.s = s;
	}
	//data behaviour
	public void setS(String s) {
		this.s = s; //this refers to member data
	} 
	public String getS() {
		return s; //returns String value
	}
	public void acceptData() {
		System.out.println("Enter a character:");
		Scanner s = new Scanner(System.in);
		this.s = s.nextLine();	
	}
	public void showData() {
		System.out.println("Entered character is: " + s);
	}
	//operations
	public String getCase() {
		if(ch>64 && ch<91)        //A-Z
			return "Uppercase.";
		else if(ch>96 && ch<123)  //a-z
			return "Lowercase.";
		else if(ch>47 && ch<58) //0-9
			return "Digit.";
		else 
			return "Special character.";	
	}
	public void checkInput() {
		count = s.length();  //count number of character 
		if(count == 1){ 
			ch = s.charAt(0);	// gets character at position 0 from String
		}
		else { 
			System.err.println("Entered value should only be a character."); //displays error msg in red
		}
	}
	//main method
	public static void main(String args[]) {
		Character c = new Character();
		c.acceptData();
		c.checkInput();
		if(count == 1)
		       	System.out.println(c.getCase());
		/*
		Character c1 = new Character();
		c1.setS("a");
		c1.checkInput();
		System.out.println(c1.getCase());
		Character c2 = new Character("A");
		c2.checkInput();
		System.out.println(c2.getCase());
		*/
	}
}
