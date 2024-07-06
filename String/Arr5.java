/**
 * WAP that accepts numbers in 2d array of 4 by 5 and display the sum of rows, columns and the entire matrix
 */

import java.util.Scanner;
class Arr5 {

	public static void main(String args[]) {
		int i, j, esum = 0;
		int num[][] = new int[4][5];
		int rsum[] = new int[num.length];
		int csum[] = new int[num[0].length];
		Scanner n = new Scanner(System.in);
		for(i= 0; i < num.length; i+=1) {
			for(j = 0; j < num[i].length; j+=1){
			System.out.printf("Enter number at [%d][%d]: ",(i+1),(j+1));
			num[i][j] = n.nextInt();
			esum += num[i][j];
			rsum[i] += num[i][j];
			csum[j] += num[i][j];
			}
		}
		System.out.println("Matrix of order:" + num.length + "," + num[0].length + ":");
		for(i = 0; i < num.length; i+=1) {
			for(j = 0; j < num[i].length; j+=1) 
				System.out.print(num[i][j] + "\t");
			System.out.println("rs=" + rsum[i]);
		}
		for(i = 0; i < num[0].length; i+=1) 
			System.out.print("cs=" + csum[i] + "\t");
		System.out.println("sum= " + esum);
	}
}
