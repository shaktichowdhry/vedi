class T7 {
	public static void main(String args[]) {
		int i,j,n,k;
		n = 6;
		for(i=1;i<=n;i+=1) {
			k=1;
			for(j=1;j<=(2*n)-1;j+=1) {
				if(j>=(n+1)-i && j<=(n-1)+i) {
					System.out.print(k);
					if(j<n)
						k+=1;
					else
						k-=1;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
