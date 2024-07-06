/** WAP that displays Hello World on screen */
class Hello {      //class name in Title_Case
	//data 
	protected String str;  //protected used for security and reusablity
	//constructor
	public Hello() {  
	}
	public Hello(String str) {  //constructor with argument
		this.str = str;    //this refers to member data
	}
	//data behaviour
	public String getData() {
		return str;
	}
	public void setData(String str) {  //name in camel_Case
		this.str = str;
	}
	//main method
	public static void main(String args[]) {
		Hello h = new Hello();  //reference and object is created
		h.setData("Hello world"); 
		System.out.println(h.getData()); //System class called form lang package		
	}
} //scope of class Hello ends
