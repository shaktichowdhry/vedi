/**
 * Create a matrix that contains sales of 4 product in 5 regions and perform the following operations
 * Total sales made by the company region-wise
 * Total sales made by the company product-wise
 * Highest and the lowst selling products
 * Total sales made by the company
 */

import java.util.Scanner;
class Arr6 {

	public static void main(String args[]) {
		int i, j, min, high, tsum = 0;
		int sales[][] = new int[4][5];
		int rsum[] = new int[sales[0].length];
		int psum[] = new int[sales.length];
		Scanner in = new Scanner(System.in);
		for(i = 0; i < sales.length; i+=1) {
			for(j = 0; j < sales[i].length; j+=1) {
				System.out.printf("Enter sales of product [%d] at region [%d]:",(i+1),(j+1));
				sales[i][j] = in.nextInt();
			}
			System.out.println();
		}
		min = sales[0][0];
		high = sales[0][0];
		for(i = 0; i < sales.length; i+=1) {
			for(j = 0; j < sales[i].length; j+=1) {
				rsum[j] += sales[i][j];
				psum[i] += sales[i][j];
				tsum += sales[i][j];
				if(min > sales[i][j])
					min = sales[i][j];
				if(high < sales[i][j])
					high = sales[i][j];
			}
		}
		for(i = 0; i < sales.length; i+=1){
			for(j = 0; j < sales[i].length; j+=1) 
				System.out.print(sales[i][j] + "\t");
			System.out.println("ps=" + psum[i]);
		}
		for(i = 0; i < rsum.length; i+=1) {
			System.out.print("rs=" + rsum[i] + "\t");
		}
		System.out.println("totalsum= " + tsum);
		System.out.println("\nHighest: " + high + "\nLowest: " + min);
	}
}

