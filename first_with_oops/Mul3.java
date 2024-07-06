/** WAP that displays multiple of 3 from 300 to 100. */
class Mul3 extends Even { //Multilevel inheritance
	/*data members added from superclass
	 * s
	 * e
	 * col
	 * mul
	 */
	protected int count = 1;
	public Mul3() {
	}
	public Mul3(int s, int e, int mul) {
		super(s,e,mul);
	}
	public Mul3(int s, int e, int mul, int col) {
		super(s,e,mul,col);
	}
	}
	/*data behaviour called from superclass class
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
	 * acceptCol();
	 * showData();
	 */
	//operation
	@Override
	public void getOp() {
		for(; s >= e; s--) {
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
		Mul3 e = new Mul3(300, 100, 3);
		e.getOp();
		/*
		Mul3 e1 = new Mul3();
		e1.acceptData();
		e1.acceptEnd();
		e1.acceptMul();
		e1.acceptCol();
		e1.getOp();
		*/
	}
}
