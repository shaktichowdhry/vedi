/**
 * WAP that accepts a string from user and perform the following checks
 * The string should have atleast 6 characters
 * The string should not have any special characters except "@"
 * If any condition is not satisfied appropriate error message should be displayed
 */

import java.util.Scanner;
class Str4 {

	public static void main(String args[]) {
		String str =  new String();
		abc:
		while(true) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string:");
		str = s.nextLine();
		if(str.length() < 6) {
			System.err.println("String shouls have atleast 6 characters\n");
			continue abc;
		}
		for(int i =0; i < str.length(); i++) {
			if(str.charAt(i) == '@') {
				System.err.println("String accepts no special character except @\n");
				continue abc;
			}
		}			
		break;
		}
	}
}
