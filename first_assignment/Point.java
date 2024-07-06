import java.util.Scanner;
class Point {
	private int x;
	private int y;
	public int getX()  {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int a) {
		x = a;
	} 
	public void setY(int b) {
		y = b;
	}
	public static void main(String args[]) {
		Point p = new Point();
	      	p.setX(20);
		p.setY(50);
		System.out.println("Point is:" + "\n"+ p.getX() + "\n" + p.getY());	
	} 
}
