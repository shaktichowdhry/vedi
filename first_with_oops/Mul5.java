/** WAP that displays sum and average of multiple of 5 from 500 to 600. */
import java.util.Scanner;
class Mul5 extends Limits { //single inheritance
	/*data members called from base class
	 * s
	 * e
	 * col
	 * mul
	 */
	protected int sum = 0;
	protected int count = 0;
	//constructors
	public Mul5() {
	}
	public Mul5(int s, int e, int mul) {
		super(s, e, mul);
	}
	/*data behaviour called from base class
	 * getS();
	 * setS(int s);
	 * getE();
	 * setE(int e);
	 * getColumn();
	 * setMultipleOf(int mul);
	 * getMultipleOf();
	 * setColumn(int col);
	 * acceptData();
	 * acceptEnd();
	 * acceptMul();
	 * showData();
	 */ 
	//operations
	public int getAvg() {
		return (sum/count);
	}
	public int getSum() {
		for(;s <= e; s++) {
			if(s % mul == 0){
				sum += s;
				count++;
			}	      
		} 
		return sum;	
	} 
	//main method
	public static void main(String args[]) {
		Mul5 e = new Mul5(500, 600, 5);
		System.out.println("Sum of multiples of " + e.getMultipleOf() + " from " + e.getS() + " to " + e.getE() + " is: " + e.getSum());
		System.out.println("Average comes out to be: " + e.getAvg());
		/*	
		Mul5 e1 = new Mul5();
		e1.acceptData();
		e1.acceptEnd();
		e1.acceptMul();
		System.out.println("Sum of multiples of " + e1.getMultipleOf() + " from " + e1.getS() + " to " + e1.getE() + " is: " + e1.getSum());
		System.out.println("Average comes out to be: " + e1.getAvg());
		*/
	}	
}
