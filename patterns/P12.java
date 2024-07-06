/**
 *WAP that accepts following pattern
 55555555
 4444 444
 333   33
 22     2
 1
*/
class P12 {
	public static void main(String args[]) {
		int i,j,n,k;
		n = 5;
		k = n ;
		for(i=1; i<=n; i+=1) {
			for(j=1; j<(n*2)-1; j+=1) {
				if(j<=((n+1)-i) || j>=((n-1)+i)) {
					System.out.print(k);
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			k-=1;
		}
	}	
}

