class ex2 {
	public static void main(String args[]) {
		int num = 0;
		try {
			try { 
				num = Integer.parseInt(args[0]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid Argument.");
			}
			catch(NumberFormatException e) {
				System.out.println("Argument cannot be string.");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		finally {
			System.out.println(Math.pow(num,2));
		}
	}
}

