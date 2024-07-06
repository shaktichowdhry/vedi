import java.util.Scanner;
class Temp {
	public static void main(String args[]) {
		float cen,fah=0;
		System.out.println("Enter temprature in centigrade:");
		Scanner t=new Scanner(System.in);
		cen =t.nextFloat();
		fah=(float)((cen*9/5)+32);
		System.out.println("\nTemprature in fahrenheit is:" +fah);
	}
}
