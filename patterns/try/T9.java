class T9 {
	public static void main(String args[]) {
		int i,j,n,k = 0;
		n = 8;
		for(i=1; i<=(n*2)-1; i+=1) {
			k = i<=n ?k+1 :k-1;
			for(j=1; j<=(n*2)-1; j+=1) {
				if(j<=(n+1)-k || j>=(n-1)+k)
					System.out.print("*");
				else
					System.out.print(" ");
				}
		System.out.println();
		}
	}
}

