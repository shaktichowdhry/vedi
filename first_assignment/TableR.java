import java.util.Scanner;
class TableR {
	public static void main(String args[]) {
		int a;
		int count = 10;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		a= r.nextInt();
		for(;count>=1;count--) {
			System.out.println(a + " x " + count + " = " + (a*count));
		}
	}
}
