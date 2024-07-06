import java.util.Scanner;
class Limits {
	//data
	protected int s;
	protected int e;
	protected int col;
	protected int mul;
	//constructors
	public Limits() {
	}
	public Limits(int s, int e, int mul) {
		this(s,e,mul,5);	
	}
	public Limits(int s, int e, int mul ,int col) {
		this.s = s;
		this.e = e;
		this.mul = mul;
		this.col = col;
	}
	//data behaviour
	public int getS() {
		return s;
	}
	public int getE() {
		return e;
	}
	public void setS(int s) {
		this.s = s; 
	}
	public void setE(int e) {
		this.e = e;
	}
	public void setColumn(int col) {
		this.col = col;	
	}
	public int getColumn() {
		return col;
	}
	public void setMultipleOf(int mul) {
		this.mul = mul;
	}
	public int getMultipleOf() {
		return mul;
	}
	public void acceptData() {
		System.out.println("Enter starting number:");
		Scanner s = new Scanner(System.in);
		this.s = s.nextInt();
	}
	public void acceptEnd() {
		System.out.println("Enter Ending number:");
		Scanner e = new Scanner(System.in);
		this.e = e.nextInt();
	}
	public void acceptMul() {
		System.out.println("Enter number who\'s multiples you want to find: ");
		Scanner mul = new Scanner(System.in);
		this.mul = mul.nextInt();
	}
	public void acceptCol() {
		System.out.println("Enter number of column:");
		Scanner col = new Scanner(System.in);
		this.col = col.nextInt();
	}
	public void showData() {
		System.out.println("Starting value: " + s);
		System.out.println("Ending value: " + e);
		System.out.println("Multiple of: " + mul);
		System.out.println("Number of columns: " + col);		
	}

}
