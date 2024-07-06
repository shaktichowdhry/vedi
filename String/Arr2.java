/**
 * WAP that accepts 10 names in an array and diaplay all the names that ends with h
 */

import java.util.Scanner;
class Arr2 {
	public static void main(String args[]) {
		String s[] = new String[10];
		int i = 0;
		for(String st : s) {
			Scanner str = new Scanner(System.in);
			System.out.printf("Enter name[%d]: ",(i+1));
			s[i] = str.nextLine();
			i+=1;
		}
		for(String x : s) {
			if(x.endsWith("h") == true)
				System.out.println(x);
		}
	}
}

