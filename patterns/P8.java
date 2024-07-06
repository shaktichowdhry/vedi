/**
 *WAP that prints following pattern
     1
    222
   33333
  4444444
 55555555
*/
class P8 {
	public static void main(String args[]) {
		int i,j,n,k;
		n = 5;
		for(i=1; i<=n; i+=1) {
			k=1;
			for(j=1; j<(2*n)-1; j+=1) {
				if(j>=(n+1)-i && j<=(n-1)+i) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
