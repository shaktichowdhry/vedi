/**
 * WAP that accepts a string from user and perform the following checks
 * The string should have atleat 5 characters
 * The string should not have any special character or alphabets except digits
 * If any condition is not satisfied appropriate error message should be displayed
 */

import java.util.Scanner;
class Str3 {

	public static void main(String args[]) {
		String str = new String();
		abc:
		while(true) {
		System.out.println("Enter a string:");
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		if(str.length()<5) {
			System.err.println("String should have atleast 5 characters\n");
			continue abc;
		}
		else {
			for(int i =0;i<str.length(); i++) {
				if (!(str.charAt(i)>=48 && str.charAt(i)<=57)) {
					System.err.println("String should only contain digits\n");
					continue abc;
				}			
			}		
		}
		break;
		}
	}
}

