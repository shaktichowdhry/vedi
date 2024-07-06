/** WAP that accepts a character and print whether it is an uppercase,lowercase, digit or a special character. */
import java.util.Scanner;
class Char_Ternary extends Character { //inheritance
	/*data members added through base class
	 * s
	 * count
	 * ch
	 */
	//constructors
	public Char_Ternary() {
	}
	public Char_Ternary(String s) {
		super(s);
	}
	/*Data behaviour added through base class
	 *getS();
	 *setS(String s);
	 *acceptData();
	 *showData();
	 */
	/*operations added through base class
	 * checkInput();
	 */
	@Override
	public String getCase() {
		//System.out.println("Override done.");
		if(ch>64)
			return (ch<91)?"Uppercase.":(ch<123)?"Lowercase.":"Special character";
		else if(ch<58)
			return (ch>47)?"Digit.":"Special character";
		else
			return "Special character";
	}
	//main function
	public static void main(String args[]) {
		Char_Ternary t = new Char_Ternary();
		t.acceptData();
		//t.showData();
		t.checkInput();
		if(count == 1)
		System.out.println(t.getCase());
	}
}
