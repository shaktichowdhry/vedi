/**
 *WAP that prints following pattern
 54321234
 5432 234
 543   34
 54     4
 5
 5
 54     4
 543   34
 5432 234
 54321234
*/
class P13 {
	public static void main(String args[]) {
		int i,j,n,k = 0,l;
		n = 5;
		for(i=1; i<=(n*2); i+=1) {
			l = n;
			if(i==(n+1));
			else	
				k = i<=n ?k+1 :k-1;
			for(j=1; j<(n*2)-1; j+=1) {
				if(j<=(n+1)-k || j>=(n-1)+k) {
					System.out.print(l);
					if(j<n)
						l-=1;
					else
						l+=1;
				}
				else {
					System.out.print(" ");
					if(j == n)
						l+=1;
				}

				}
		System.out.println();
		}
	}
}

