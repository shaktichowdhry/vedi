import java.util.Scanner;
class Point {
	protected int x;
	protected int y;
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	public void setX(int x) {
		this.x = x;
	}
	public void seyY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void acceptData() {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter value of x: ");
	this.x = in.nextInt();
	System.out.print("Enter value of y: ");
	this.y = in.nextInt();
	}
	public void showData() {
		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);
	}
	public static void main(String args[]) {
		Point p = new Point();
		p.acceptData();
		p.showData();
	}

}
