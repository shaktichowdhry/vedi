import java.util.Scanner;
class ex1 {
	public static void main(String args[]) {
		int a,b,c = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a:");
		a = s.nextInt();
	       	System.out.print("\nEnter b:");
		b = s.nextInt();
		try {
		c = a/b;
		}
		catch(Exception e) {
			System.out.println("This gives ous exception class" + e);
			System.out.println("cannot divide by zero.");
			System.out.println("using get message " + e.getMessage());
			e.printStackTrace();
		}	
		System.out.println("lol " + c);
	}
}
