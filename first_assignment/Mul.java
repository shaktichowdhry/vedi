class Mul {
	public static void main(String args[]) {
		int s= 300;
		int e =100;
		int count =1;
		for(;s>=e;s--) {
			if(s%3==0)
				System.out.print(s + "\t");
			if(count%15==0)
				System.out.println();
			count++;
		}
	System.out.println();
	}
}
