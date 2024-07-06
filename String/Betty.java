/**
 * WAP that initiaizes a String with "Betty got a bit of bitter better butter"  and perform the following operations:
 * Display all the occurrence of "b" and "t" in the string
 * Display each word along with its length in a new line
 * Display all the words that starts with "b" in the string
 */

class Betty {
	public static void main(String args[]) {
		String s1 = new String("Betty got a bit of bitter better butter");
		System.out.println("a.");
		for(int x = 0; x < s1.length(); x++) {
			if(s1.charAt(x) == 'b')
				System.out.println("b at: " + (x+1));
			if(s1.charAt(x) == 't')
				System.out.println("t at: " + (x+1));
		}
		System.out.println("b.");
		String str[] = s1.split(" ");
		for(String i : str) {
			System.out.println(i + " " + i.length());
		}
		System.out.println("c.");
		String st[] = s1.split(" ");
		for(String x : st) {
			if(x.startsWith("b") == true)
				System.out.println(x);
		}
	}
}
