/**
 * WAP that use Lambda as an argument
 */

interface StringFunc {
	String func(String n);
}

public class LambdasAsArgumentsDemo {
	
	static String stringOp(StringFunc sf, String s) { //abhi hum khud ka static fun bna rhe h baad mai java ka use karenge
		return sf.func(s); 
	}

	public static void main(String args[]) {
		String inStr = "Lambda adds power to java";
		String outStr;
		System.out.println("Here is input string: " + inStr);
		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("The string in uppercae: " + outStr);
		outStr = stringOp((str) -> {
			String result = "";
			for(int i =0;i<str.length();i++)
				if(str.charAt(i)!= ' ')
					result+=str.charAt(i);
			return result;
		},inStr);
		System.out.println("The string with spaces removed: " + outStr);
		StringFunc reverse = (str) -> {
			String result = "";
			for(int i = str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		System.out.println("The string reversed: " + stringOp(reverse,inStr));
	}
}
