/**
 * WAP that accepts a String from user and perform the following checks
 * The string should have atleast 3 characters
 * the string should not have any specialcharacters or digits except alphabets
 * If any condition is not satisfied approriateerroe message should be displayed
 */

import java.util.Scanner;
class Str2 {

	public static void main(String args[]) {
		String str = new String();
		abc:
		while(true) {
		System.out.println("Enter a word:");
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		if(str.length() < 3) {
			System.err.println("Word should have at least 3 character.\n");
			continue abc;
		}
		else {
			for(int i = 0; i<str.length(); i++) {
				if(!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
					System.err.println("String can only be an alphabet\n");
					continue abc;
				}
			}
		}
		break;
		}
	}
}
