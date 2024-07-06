import java.util.Scanner;
class Vow {
	public static void main(String args[]) {
		char c ;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter character:");
		c= n.next().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			System.out.println("vowel");
		else if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			System.out.println("vowel");
		else if(c>64 && c<124)
			System.out.println("consonant");
		else 
			System.err.println("Enter an alphabet.");
	}
}
