/**
*WAP that prints the following pattern
    1
   21
  321
 4321
54321
*/
class P3 {
	public static void main(String args[]) {
		int i,j,n,k;
		n = 5;
		for(i=1; i<=n; i+=1) {
			k = n;
			for(j=1; j<=n; j+=1) {
				if(j>=(n+1)-i) {
					System.out.print(k);
					k-=1;
				}
				else {
					System.out.print(" ");
					k-=1;
				}
			}
			System.out.println();
		}
	}
}
