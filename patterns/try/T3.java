class T3 {
	public static void main(String args[]) {
		int i,j,n;
		n = 7;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(j<=(n+1) - i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
