import java.util.Scanner;

class LambdaDemo {

	protected static String s;

	public LambdaDemo() {
		s = new String();
	}	

	public LambdaDemo(String s) {
		this.s = s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);	
	}

	static Integer integerOp(NumericFunc nf, String n) {
		return nf.func(n);
	}

	public static String toTitleCase(String str) {
		String result = new String();
		String s = str.trim().toLowerCase();
		Integer i, j;
		Character c;
		for(i = 0; i < s.length(); i +=1) {
			c = s.charAt(i);
			if(c.equals(' ')) {
				while(true) {	
					j = ++i;
					c = s.charAt(j);
					if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
						result += s.toUpperCase().charAt(j);
						i = j;
						break;
					}
				}
			}
			else {
				if(i.equals(0))
					result += s.toUpperCase().charAt(i);
				else
					result += s.charAt(i);
			}
		}
		return result;
	}

	public static String toCamelCase(String str) {
		String result = new String();
		String s = str.trim().toLowerCase();
		Integer i, j;
		Character c;
		for(i = 0; i < s.length(); i +=1) {
			c = s.charAt(i);
			if(c.equals(' ')) {
				while(true) {	
					j = ++i;
					c = s.charAt(j);
					if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
						result += s.toUpperCase().charAt(j);
						i = j;
						break;
					}
				}
			}
			else {
					result += s.charAt(i);
			}
		}
		return result;
	}
	
	public static String removeSpaces(String str) {
		String result = new String();
		for(Integer i = 0; i < str.length(); i += 1) {
			if(str.charAt(i) != ' ')
				result += str.charAt(i);
		}
		return result;
	}

	public static Integer countVowels(String str) {
		Integer count = 0;
		Character c;
		for(int i = 0; i < str.length(); i += 1) {
			c = str.toLowerCase().charAt(i);
			if(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('u'))
				count += 1;
		}
		return count;
	}

	public static Integer countConsonants(String str) {
		Integer count = 0;
		Character c;
		for(Integer i = 0; i < str.length(); i += 1) {
			c = str.toLowerCase().charAt(i);
			if(!(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u') || c.equals(' ')))
				count += 1;
		}
		return count;
	}

	public static Integer countAlphabets(String str) {
		Integer count = 0;
		Character c;
		for(Integer i = 0; i < str.length(); i+=1) {
			c = str.toLowerCase().charAt(i);
			if(c >= 'a' && c<= 'z' || c>= 'A' && c<= 'Z')
				count += 1;
		}
		return count;
		
	} 

	public static Integer countWords(String str) {
		Integer count = 1;
		String s = str.trim();
		Character j;
		for(Integer i = 0; i< s.length(); i += 1)
			if(s.charAt(i) == ' ') {
				j = s.charAt(i+1);
				if(j >= 'a' && j <= 'z' || j >= 'A' && j <= 'Z')
					count +=1;
		}
		return count;
	
	}

	public void getInput() {
		Scanner in = new Scanner(System.in);
		Character ch = in.next().toLowerCase().charAt(0);
			if(ch >= 'a' && ch <= 'h') {
		 		if(ch.equals('a')) {
					acceptData();
					System.out.println(stringOp(LambdaDemo::toTitleCase, s));
				}
				if(ch.equals('b')) {
					acceptData();
					System.out.println(stringOp(LambdaDemo::toCamelCase, s));
				}
				if(ch.equals('c')) {
					acceptData();
					System.out.println(stringOp(LambdaDemo::removeSpaces, s));
				}
				if(ch.equals('d')) {
					acceptData();
					System.out.println(integerOp(LambdaDemo::countVowels, s));
				}
				if(ch.equals('e')) {	
					acceptData();
					System.out.println(integerOp(LambdaDemo::countConsonants, s));
				}
				if(ch.equals('f')) {
					acceptData();
					System.out.println(integerOp(LambdaDemo::countAlphabets, s));
				}
				if(ch.equals('g')) {
					acceptData();
					System.out.println(integerOp(LambdaDemo::countWords, s));
				}
				if(ch.equals('h')) {
					System.exit(0); //successfully terminated (not abnormal termination)
				}
			}
			else {
				System.out.print("Wrong Input.\nRe-Enter Input: ");
				getInput();
			}
		}
	
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string: ");
		this.s = in.nextLine();
	}

	public void showData() {
		System.out.printf("\n %35s Welcome to String Library\n", " ");
		System.out.println("Enter a respective character to do any operation:");
		System.out.println("a. Convert string to title case." + 
				"\nb. Convert string to camel case." + 
				"\nc. Remove spaces from string." + 
				"\nd. Count number of vowels in a string." + 
				"\ne. Count number of consonants in a string." + 
				"\nf. Count number of alphabets in a string." + 
				"\ng. Count number of words in a string." + 
				"\nh. Exit.\n");
		System.out.print("Your Input: ");
	}
	
	public static void main(String args[]) {
		LambdaDemo l = new LambdaDemo();
		l.showData();
		l.getInput();
	}
}
