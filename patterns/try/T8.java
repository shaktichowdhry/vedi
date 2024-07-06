class T8 {
	public static void main(String args[]) {
		int i,j,n;
		n = 4;
		for(i=1;i<=n;i+=1) {
			char k = 'A';
			for(j=1;j<=(n*2)-1;j+=1) {
				if(j<=((n+1)-i) || j>=((n-1)+i)) {
					System.out.print(k);
					if(j>n)
						k-=1;
					else
						k+=1;
					}
				else {
					System.out.print(" ");
					if(j==n)
						k--;
				}
			}
			System.out.println();
		}
	}	
}

