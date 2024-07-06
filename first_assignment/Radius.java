import java.util.Scanner;
class Radius {
	public static void main(String args[]) {
		float radius,area=0,cirm=0;
		System.out.println("Enter radius of circle:");
		Scanner r= new Scanner(System.in);
		radius = r.nextFloat();
		area =(float)(Math.PI*Math.pow(radius,2));
		cirm=(float)(2*Math.PI*radius);
		System.out.println("\nArea of circle is: "+area+"\nCircumference of circle is: "+ cirm); 
	}
}
