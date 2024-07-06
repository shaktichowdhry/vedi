import java.util.Scanner;
class Ch_Detect {
	public static void main(String args[]) {
		char ch;
		System.out.println("Enter a character:");
		Scanner c = new Scanner(System.in);
		ch = c.next().charAt(0);
		if(ch>='a' && ch<='z' )
			System.out.println(ch + " is a lowercase character.");
		else if(ch>='A' && ch<='Z')
			System.out.println(ch + " is an uppercase character.");
		else if(ch>=0 && ch<=9)
			System.out.println(ch + " is a digit.");
		else		
                	System.out.println(ch + " is a special character.");
	}

}
