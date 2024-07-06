import java.util.Scanner;
class Count {
	public static void main(String args[]) {
		int a,n;
		int count = 0;
		Scanner c  = new Scanner(System.in);
		System.out.println("Enter any integer value:");
		a =c.nextInt();
		for(n=a;n>0;count++) {
		n=(int)(n/10);
		}
		System.out.println(count);
	}
	
}
