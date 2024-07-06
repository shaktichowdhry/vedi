/** WAP that accepts a character and print wheteher it is a vowel or a consonant. */
class Vowel extends Character { //inheritance
	/*data members added through base class
	 * s
	 * count
	 * ch
	 */
	//constructors
	public Vowel() {
	}
	public Vowel(String s) {
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
	public String getVow() {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return "vowel.";
		else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return "vowel.";
		else if(ch>64 && ch<124)
			return "consonant.";
		else 
			return "Enter an alphabet.";
	}
	//main function
	public static void main(String args[]) {
		Vowel t = new Vowel();
		t.acceptData();
		//t.showData();
		t.checkInput();
		if(count == 1)
		System.out.println(t.getVow());
	}
}
