/**
 *Create a class that counts the number od its object created
 *If the objects counts is less than 5, it should display a message "too less"
 *when it is equal to 5 "will do" should be displayed
 *If more than 5 objects are created it should display "Exeeding the limit"
 *Write suitable constructors and method
 *Also write a method that returns the number of object created
 */
import java.util.Scanner;
class ObjCount {
	protected static int count = 0;
	public ObjCount() {
		count++;
	}
	public int getCount() {
		return count;
	}
	public void getOp() {
		if(count < 5)
			System.out.println("Too Less");
		else if(count == 5)
			System.out.println("Will do");
		else 
			System.out.println("Exceeding the limits");
	}
	public static void main(String args[]) {
		for(int i =1; i <= 6; i++) {
		ObjCount o = new ObjCount();
		System.out.println("Number of objects created: " + o.getCount());
		o.getOp();
		}
	}
}
