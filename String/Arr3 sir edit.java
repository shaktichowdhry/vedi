/**
 * WAP that accepts 10 names in an array and display all names that contains "he"
 */

import java.util.Scanner;
class Arr3 {

	public static void main(String args[]) {
		String s[] =new String[10];
		Scanner str = new Scanner(System.in);
		for(int i = 0; i < s.length; i+=1) {
			System.out.printf("Enter name[%d]: ",(i+1));
			s[i] = str.nextLine();
		}
		for(int j=0;j<s.length;j+=1) {
			String c = s[j];
			for(int k = 0; k < c.length(); k+=1) { 
				if(c.charAt(k) == 'h') {
					k+=1;
					if(c.charAt(k) == 'e') {
						System.out.println(c);
						break;
					}
					else
						k-=1;
				}
			}
		}
	}
}

/*

for(String x : s) {
			if(x.toUpperCase().contains("he"))
				System.out.println(x);
		}


for(String x : s) {
			if(x.toUpperCase().indexOf("he")!=-1)
				System.out.println(x);
		}
 */
