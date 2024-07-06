/** WAP that accepts a number and print its table. */
import java.util.Scanner;
class Table {
	protected int num;
	protected int lim;
	protected int elim;
	public Table() {
	}
	public Table(int num) {
		this.num =num;
		lim =1;
		elim=10;
	}
	public Table(int num, int lim, int elim) {
		this.num = num;
		this.lim = lim;
		this.elim = elim;
	}
	public Table(int lim, int elim) {
		this.lim = lim;
		this.elim = elim;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	public void setLim(int lim) {
		this.lim = lim;
	}
	public int getLim() {
		return lim;
	}
	public void setElim(int elim) {
		this.elim = elim;
	}
	public int getElim() {
		return elim;
	}
	public void acceptData() {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number who\'s table you want:");
		this.num = num.nextInt();
	}
	public void acceptLimits(){
		Scanner lim = new Scanner(System.in);
		System.out.println("Enter starting number:");
		this.lim = lim.nextInt();
		Scanner elim = new Scanner(System.in);
		System.out.println("Enter end limit:");
		this.elim = elim.nextInt();
	}
	public void showData() {
		System.out.println("Enteres number: " + num);
	}
	public void getOp() {
		for(;lim <= elim;lim++) {
			System.out.println(num + " x " + lim + " = " + (num*lim));	
		}
	}
	public static void main(String args[]) {
		/*
		Table t = new Table();
		t.acceptData();
		t.acceptLimits();
		t.getOp();
		Table t1 = new Table(10,1,3);
		t1.getOp();
		*/
		Table t2 = new Table(1,10);
		t2.acceptData();
		t2.getOp();
	}
}
