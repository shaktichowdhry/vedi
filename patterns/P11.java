/**
 *WAP that prints following pattern
 543212345
 5432 2345
 543   345
 54     45
 5       5
*/
class P11 {
	public static void main(String args[]) {
		int i,j,n;
		n = 5;
		for(i=1; i<=n; i+=1) {
			int k = n;
			for(j=1; j<=(n*2)-1; j+=1) {
				if(j<=((n+1)-i) || j>=((n-1)+i)) {
					System.out.print(k);
					if(j >= n)
						k+=1;
					else
						k-=1;
					}
				else {
					System.out.print(" ");
					if(j == n)
						k+=1;
				}
			}
			System.out.println();
		}
	}	
}

