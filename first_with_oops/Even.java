/** WAP that displays even numbers from 100 to 200. */
class Even extends Limits {
	/*data members called from base class
	 * s
	 * e
	 * col
	 * mul
	 * count
	 */
	protected int count = 1;
	//constructors
	public Even() {
	}
	public Even(int s, int e, int mul) {
		super(s, e, mul);
	}
	public Even(int s, int e, int mul, int col) {
		super(s, e, mul, col);
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
	 * acceptCol();
	 * acceptMul();
	 * showData();
	 */
	//operations
	public void getOp() {
		for(; s <= e; s++) {
			if(s % mul == 0) 
				System.out.print(s + "\t"); //tab
			if(count%(mul * col) == 0)    //presentation
				System.out.println();
			count++; 
		}
		System.out.println(); 
	}
	//main method
	public static void main(String args[]) {
		Even e = new Even(100, 200, 2);
		e.getOp();
		/*
		Even e1 = new Even();
		e1.acceptData();
		e1.acceptEnd();
		e1.acceptMul();
		e1.acceptCol();
		e1.getOp();
		*/
	}
}
