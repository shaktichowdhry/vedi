import java.util.Scanner;
class Rectangle {
	public static void main(String args[]) {
		float height,width,area=0,peri=0;
		System.out.println("Enter height of rectangle:");
		Scanner h = new Scanner(System.in);
		height= h.nextFloat();
		System.out.println("Enter width of rectangle:");
		Scanner w = new Scanner(System.in);
		width= w.nextFloat();
		area=(height*width);
		peri=(float)(2*(height+width));
		System.out.println("\nArea of rectangle is: "+ area+"\nPerimeter of rectangle is:" + peri);
	}
}
