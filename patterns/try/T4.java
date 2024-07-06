class T4 {
	public static void main(String args[]) {
		int i,j,n;
		n =7;
		for(i=1;i<=n;i++) {
			for(j=1;j<=(n*2)-1;j++) {
				if(j<=((n-1)+i) && j>=((n+1) -i))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
