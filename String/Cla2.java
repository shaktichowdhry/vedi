/**
 * WAP that accepts  numbers as a command line argument and dispaly their sum and avegare, 
 * Also display these numbers in assending order
 */

class Cla2 {
	public static void main(String args[]) {
		int i, j, n, min, index, temp = 0,sum = 0,avg = 0;
		n = 5;
		int a[] = new int[n];
		if(!(args.length == 5)) 
			System.err.println("Invalid Argument");
		else {
			for(i = 0; i < args.length; i+=1) {
				a[i] = Integer.parseInt(args[i]);
				sum += a[i];	
			}
			System.out.println("Sum: " + sum + "\nAverage: " + sum/n);
			System.out.println("Numbers sorted in assending order: ");
		
			for(i = 0; i < (a.length-1); i+=1) {
				min = a[i];
				index = i;
				for(j = (i+1); j < a.length; j+=1) {
					if(min > a[j]) {
						min  = a[j];
						index = j;
					}
				}
				temp = a[i];
				a[i] = min;
				a[index] = temp;
			}
	
			for(int x : a)
				System.out.println(x + " ");
		}
	}
}
