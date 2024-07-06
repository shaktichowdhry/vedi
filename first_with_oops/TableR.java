/** WAP that accepts a number and print its reverse multiplication table. */
class TableR extends Table { //single inheritance
	public TableR() {
	}
	public TableR(int num) {
		super(num);
	}
	public TableR(int lim, int elim) {
		super(lim,elim);
	}
	public TableR(int num, int lim, int elim) {
		super(num, lim, elim);
	}
	@Override
	public void getOp() {
		for(;elim >= lim;elim--) {
			System.out.println(num + " x " + elim + " = " + (num*elim));	
		}
	}
	public static void main(String args[]) {
		/*
		TableR t = new TableR();
		t.acceptData();
		t.acceptLimits();
		t.getOp();
		TableR t1 = new TableR(12,1,3);
		t1.getOp();
		*/
		TableR t2 = new TableR(1,10);
		t2.acceptData();
		t2.getOp();
	}
}
