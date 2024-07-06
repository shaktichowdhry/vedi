/**
 *WAP that prints following pattern
    1
   101
  10101
 1010101
10101010
*/
class P9 {
	public static void main(String args[]) {
		int i,j,n,k;
		n = 5;
		for(i=1; i<=n; i+=1) {
			for(j=1; j<(2*n)-1; j+=1) {
				if(j>=(n+1)-i && j<=(n-1)+i) {
					k = (i+j) % 2 == 0 ?0:1;
					System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
