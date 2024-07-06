import java.util.Scanner;
class Interests {
	public static void main(String args[]) {
		float p,r,t,si,ci;
		System.out.println("Enter principle:");
		Scanner P =new Scanner(System.in);
		p=P.nextFloat();
		System.out.println("Enter rate in percentage:");
		Scanner R =new Scanner(System.in);
		r=R.nextFloat();
		System.out.println("Enter time:");
		Scanner T =new Scanner(System.in);
		t=T.nextFloat();
		si=(float)((p*r*t)/100);
		ci=(float)(p*(Math.pow(1+r/100,t))-p);
		System.out.println("Simple interest is: "+si);
		System.out.println("compound interest is: "+ci);
	}
}
