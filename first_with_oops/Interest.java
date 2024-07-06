/** WAP that accepts principle,rate and time and display simple and compound interest. */
import java.util.Scanner; //Scanner class called from util package
class Interest {
	//Data
	protected float p; //protected used for security and reusability
	protected float r; //double data type uses 8 bytes
	protected int t;  //time in terms of years
	//constructors
	public Interest() {
	}
	public Interest(float p, float r, int t) {//constructor with arguments
		this.p = p;
	       	this.r = r;
		this.t = t;	
	}
	//Data behaviour
	public float getP() {
		return p;
	}
	public float getR() {
		return r;
	}
	public int getT() {
		return t;
	}
	public void setP(float p) {
		this.p = p;
	}
	public void setR(float r) {
		this.r = r;
	}
	public void setT(int t) {
		this.t = t;
	}
	public void acceptData() {
		System.out.println("Enter principle:");
		Scanner p = new Scanner(System.in);
		this.p =p.nextFloat(); 
		System.out.println("Enter rate in percentage:");
		Scanner r = new Scanner(System.in);
		this.r = r.nextFloat();
		System.out.println("Enter time in years:");
		Scanner t = new Scanner(System.in);
		this.t = t.nextInt();
	}
	public void showData() {
		System.out.println("Principle: " + p);
		System.out.println("Rate: " + r);
		System.out.println("Time: " + t);
	}
	//operations
	public float getSi() {
		return (float)(p*r*t/100);  
	}
	public float getCi() {
		return (float)(p*(Math.pow(1+r/100,t)) - p);
	}
	//main method
	public static void main(String args[]) {
		Interest i = new Interest();
		i.acceptData();
		i.showData();
		System.out.println("Simple interest: " + i.getSi() + "\nCompund interest: " + i.getCi());
	}
}

