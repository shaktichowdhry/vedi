/**
 *WAP that prints following pattern
     1
    12
   123
  1234
 12345
*/
class P4 {
	public static void main(String args[]) {
		int i,j,n,k;
		n = 5;
		for(i=1; i<=n; i+=1) {
			k = 1;
			for(j=1; j<=n; j+=1) {
				if(j>=(n+1)-i) {
					System.out.print(k);
					k+=1;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
