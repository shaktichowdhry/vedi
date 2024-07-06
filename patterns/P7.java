/**
 *WAP that prints following pattern
 0
 10
 010
 1010
 01010
*/
class P7 {
	public static void main(String args[]) {
		int n = 5;
		int i,j,k;
		for(i =1; i<=n; i+=1) {
			for(j=1; j<=i; j++) {
				k = (i+j)%2 == 0?0:1;
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
