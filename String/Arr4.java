/**
 * WAP that accepts 10 numbers in an array and diaplay them in assending order
 */

import java.util.Scanner;
class Arr4 {

	public static void main(String args[]) {
		int num[] = new int[10];
	       	int i, j, min, pos, temp;
		Scanner n = new Scanner(System.in);
		for(int k = 0; k < num.length; k+=1 ) {
			System.out.printf("Enter number[%d]: ",(k+1));
			num[k] = n.nextInt();
		}
		for(i = 0; i < (num.length-1); i+=1) {
			min = num[i];
			pos = i;
			for(j = (i+1); j < num.length; j+=1) {
				if(min > num[j]) {
					min = num[j];
					pos = j;
			}
		}
		temp = num[i];
		num[i] = min;
		num[pos] = temp;
		}
		for(int x : num) 
			System.out.println(x);
	}
}
