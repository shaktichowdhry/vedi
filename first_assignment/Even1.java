class Even1 {
	public static void main(String args[]) {
		int s = 100;
		int e = 200;
		int count =1;
		for(;s<=e;s++) {
			if(s%2==0) 
				System.out.print(s + "\t");
			if(count%10==0)
				System.out.println();
			count++;
		}
	System.out.println();
	}
}
