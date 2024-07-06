import java.util.Scanner;
class Table {
	public static void main(String args[]) {
		int a;
		int count = 1;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		a= r.nextInt();
		for(;count<=10;count++) {
			System.out.println(a + " x " + count + " = " + (a*count));
		}
	}
}
