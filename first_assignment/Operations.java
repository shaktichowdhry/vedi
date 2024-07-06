import java.util.Scanner;
class Operaters {
	public static void main(String args[]) {
		float a,b,sum=0,dif=0,mul=0,div=0;
		System.out.println("Enter a number:");
		Scanner A =new Scanner(System.in);
		a=A.nextFloat();
		System.out.println("Enter another number:");
		Scanner B =new Scanner(System.in);
		b=B.nextFloat();
		sum=a+b;
		dif=a-b;
		mul=a*b;
		div=(int)(a/b);
		System.out.println("\nAddition of "+a+" and "+b+" is: "+sum);
		System.out.println("\nSubtraction of "+a+" and "+b+" is: "+dif);
		System.out.println("\nMultiplication of "+a+" and "+b+" is: "+mul);
		System.out.println("\nDivision of "+a+" and "+b+" gives quotient: "+div);
	}
}
