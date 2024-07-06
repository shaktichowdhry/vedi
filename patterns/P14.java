/**
 *WAP that prints following pattern
 555555555
 4444 4444
 333   333
 22     22
 1       1
 1       1
 22     22
 333   333
 4444 4444
 555555555
*/
class P14 {
	public static void main(String args[]) {
		int i,j,n,k = 0;
		n = 5;
		int l = n;
		for(i=1; i<=(n*2); i+=1) {
			if(i == (n+1));
			else	
				k = i<=n ?k+1 :k-1;
			for(j=1; j<=(n*2)-1; j+=1) {
				if(j<=(n+1)-k || j>=(n-1)+k)
					System.out.print(l);
				else
					System.out.print(" ");
				}
		System.out.println();
		if(i  == n);
	       	else	
			l = i >= n?l+1:l-1;
		}
	}
}

