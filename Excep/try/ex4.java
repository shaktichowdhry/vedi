class ex4 {
	public static int get(String str) throws NumberFormatException {
		int n = Integer.parseInt(str);
		return n; 
	}
	public static void main(String args[]) {
		int n = 0;
		try {
			n = get(args[0]);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		System.out.println("Square: " + Math.pow(n,2));
	}
}
