/** 
 * Create a static function that takes number and return its cube
 * if the number is greater than 100 it should generate NoCubeException
 * WAP that accepts a number as a command line argument and display its cube
 * Cube should be calculated using static function
 */

package Excep;
import java.util.Scanner;
import Excep.MyExceptionClasses.*;
class Cube {
	
	public static int convert(String str) throws NumberFormatException {
		int num = 0;
		num = Integer.parseInt(str);
		return num;
	}
	
	public static double getCube(int n) {
		int c = n;
		return Math.pow(c,3);	
	}

	public static void main(String args[]) {
		int num = 0;
		try {
			try {
				if(args.length > 1) {
					ArgumentsException e = new ArgumentsException("Invalid Argument.");
					num = 0;
					throw e;
				}
				num = convert(args[0]);
				if(num > 100) {
					NoCubeException e = new NoCubeException("Greater than 100");
					num = 0;
					throw e;
				}
			}
			catch(NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("Invalid Format");
			}
			catch(NoCubeException e) {
				System.out.println(e.getMessage());
			}
			catch(ArgumentsException e) {
				System.out.println(e.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException e) {
				//System.out.println(e.getMessage());
				System.out.println("Invalid Index");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		finally {
				System.out.println(getCube(num));
		}
	}
}
	
