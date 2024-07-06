/**
 *WAP that prints following pattern
     1
    22
   333
  4444
 55555
*/
class P5 {
	public static void main(String args[]) {
		int i,j,n;
		n = 5;
		for(i=1; i<=n; i+=1) {
			for(j=1; j<=n; j+=1) {
				if(j>=(n+1)-i) {
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
