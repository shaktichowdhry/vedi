class T5 {
	public static void main(String args[]) {
		int i,j,n;
		n =7;
		boolean k;
		for(i=1;i<=n;i++) {
			k= true;
			for(j=1;j<=(n*2)-1;j++) {
				if(j<=((n-1)+i) && j>=((n+1) -i) && k) {
					System.out.print("*");
					k = false;
				}
				else { 
					System.out.print(" ");
					k = true;
				}
			}
			System.out.println();
		}
	}
}
