/**
 *WAP that prints following pattern
     1
    10
   101
  1010
 10101
*/
class P6 {
	public static void main(String args[]) {
		int i,j,n,k;
		n = 5;
		for(i=1; i<=n; i+=1) {
			k=0;
			for(j=1; j<=n; j+=1) {
				if(j>=(n+1)-i) {
					k=k%2==0?1:0;
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
