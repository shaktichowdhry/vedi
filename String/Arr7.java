/**
 * Accept numbers in 2 matrix of 4 by 4 and dispaly the product of the matrix
 */

import java.util.Scanner;
class Arr7 {

	public static void main(String args[]) {
		int m1[][] = new int[4][4];
		int m2[][] = new int[4][4];
		int i, j, k, sum = 0;
		Scanner n = new Scanner(System.in);
		int m3[][] = new int[m1.length][m2[0].length];
		System.out.println("\nEnter first matrix:");
		for(i = 0; i < m1.length; i+=1) {
			for(j = 0; j < m1[i].length; j+=1) {
				System.out.print("\nEnter element at[" + (i+1) + "][" + (j+1) + "]:");
				m1[i][j] = n.nextInt();
			}
		}
		System.out.println("\nEnter second matrix:");
		for(i = 0; i < m2.length; i+=1) {
			for(j = 0; j < m2[i].length; j+=1) {
				System.out.print("\nEnter element at[" + (i+1) + "][" + (j+1) + "]:");
				m2[i][j] = n.nextInt();
			}
		}
		System.out.println("\nProduct of these two matrix is:\n");
		for(i = 0; i < m1.length; i+=1) {
			for(j = 0; j < m2[i].length; j+=1) {
				for(k = 0; k < m1[i].length; k+=1) {
					sum += m1[i][k]*m2[k][j];
				}
				m3[i][j] = sum;
				sum = 0;
			}
		}
		for(int x[] : m3) {
			for(int y : x) 
				System.out.print(y + "\t");
			System.out.println();
		}
	}
}
