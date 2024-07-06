/** WAP that displays your name on screen within double quotes. */
class Name extends Hello { //inheritance from Hello class to Name 
	/*Data member added from base class
	 * str
	 */
	//constructors
	public Name() {
	}
	public Name(String str) {
		super(str);  //constructor called from base class
	}
	//data behaviour
	public void setData(String str) {
	 	super.setData(str);  //super keyword should always be used in first line
	}
	@Override
	public String getData() { 
		return ("Hello " +super.getData());
	}
	//main method
	public static void main(String args[]) {
		Name n = new Name("\"Shakti\""); //constructor with arguments called
		System.out.println(n.getData());
		/*
		Name n1 = new Name();
		n1.setData("Shakti");
		System.out.println(n1.getData());	
		*/	
	}
	
}

