class Prime_Print {
	protected int start;
	protected int end;
	public Prime_Print() {
	}
	public Prime_Print(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public void setS(int start) {
		this.start = start;
	}
	public void setE(int end) {
		this.end = end;
	}
	public int getS() {
		return start;
	}
	public int getEnd() {
		return end;
	}
	public void getPrime() {
		abc:
		for(; start<end; start++) {
			for(int i =2; i<start; i++) {
			if(start == 2) {
				System.out.println(start);
				continue abc;
			}
			if(start % i == 0)
				continue abc;
			}
			System.out.println(start);
			}
		}	
	public static void main(String args[]) {
		Prime_Print p = new Prime_Print(100,200);
		//p.setS(100);
		//p.setE(200);
 		p.getPrime();
	}
}
