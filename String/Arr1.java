/**
 * WAP that accepts 10 names in an array and display all the names that starts with A
 */

import java.util.Scanner;
class Arr1 {
	public static void main(String args[]) {
		String s[] = new String[10];
		int i = 0;
		Scanner st = new Scanner(System.in);
	       	for(String str : s) {
			System.out.print("Enter name[" + (i+1) + "]: ");
			s[i] = st.nextLine();
			i+=1;
		}
		for(String x : s) {
			if(x.startsWith("A") == true)
				System.out.println(x);
		}
	}
}
