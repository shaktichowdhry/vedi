/** WAP that accepts a number as a command line argument and display its table
 * Handle all possible exceptions
 * If the number is greater than 25 it should generate a custom exception
 */

package Excep;
import java.util.Scanner;
import Excep.MyExceptionClasses.*;
class Table {
	
	public static int convert(String str) throws NumberFormatException {
		int num = 0;
		num = Integer.parseInt(str);
		return num;
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
				if(num > 25) {
					BiggerValueException e = new BiggerValueException("Number greater than 25.");
					num = 0;
					throw e;
				}
			}
			catch(NumberFormatException e) {
				//System.out.println(e.getMessage());
				//e.printStackTrace();
				System.out.println("Invalid Format");
			}
			catch(BiggerValueException e) {
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
			for(int i = 1; i <= 10; i+=1) {
				System.out.println(num + " x " + i + " = " + (num*i));
			}
		}	
	}
}
