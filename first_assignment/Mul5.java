class Mul5 {
	public static void main(String args[]) {
		int n=500;
		int e=600;
		int sum =0;
		int count =0;
		for(;n<=e;n++) {
			if(n%5==0){
				 sum+=n;
				count++;
			}	      
		} 
		System.out.println("sum: " + sum + "average: " +sum/count);
	}
}
