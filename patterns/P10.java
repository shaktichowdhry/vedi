/**
 *WAP that prints following pattern
     1
    212
   32123
  4321234
 543212345
*/
class P10 {
	public static void main(String args[]) {
		int i,j,n,k;
		n = 5;
		for(i=1;i<=n;i+=1) {
			k = n;
			for(j=1;j<=(2*n)-1;j+=1) {
				if(j>=(n+1)-i && j<=(n-1)+i) {	
					System.out.print(k);
					if(j<n) {
						k-=1;
					}
					else
						k+=1;

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
