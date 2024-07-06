/**
 * WAP that accepts a number as a command line argument and siaplay its square
 * In case of invalid argumenrt proper error messager should be displayed
 */

class Cla1 {

	public static void main(String args[]) {
		float num = 0;
		num = Float.parseFloat(args[0]);
		if(!(args.length ==1))
			System.out.println("Invalid argument");
		else
			System.out.println("Square: " + Math.pow(num,2));
	}
}
