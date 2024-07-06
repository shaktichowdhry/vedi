import java.util.Scanner;
class ex3 {
	public static void main(String args[]) {
		int n = 0;
		try { 
			n = Integer.parseInt(args[0]);
			if(n > 100) {
				Excep1 e = new Excep1("Cannot be greater than 100");
				n = 0;
				throw e;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch(Excep1 e) {
			System.out.println(e.getMsg());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(Math.pow(n,2));
	}
}
