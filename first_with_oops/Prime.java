/** WAP that accepts a number and print whether it is a prime number or a composite number. */ 
import java.util.Scanner;
class Prime {
	protected int num;
	public Prime() {
	}
	public Prime(int num) {
		this.num = num;
	}
	public void setNu(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void acceptData() {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not:");
		this.num = num.nextInt();
	}
	public void showData() {
		System.out.println("Entered number is: " + num);
	}
	public String getPrime() {
		if(num<0)
			return "Number should be positive integer.";
		else  {
			for(int i=2; i<num; i++) {
				if (num == 2) 
					return "Prime number.";
				if(num % i == 0) 
					return "Composite number.";
			}
			return "Prime number.";
		}
	}
	public static void main(String args[]) {
		Prime p = new Prime();
		p.acceptData();
		System.out.println(p.getPrime());
	}
}




