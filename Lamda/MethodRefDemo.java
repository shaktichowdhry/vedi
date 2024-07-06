interface StringFunc {
	String func(String n);
}

class MethodRefDemo {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	static String strReverse(String str) {
		String result = "";
		for(int i = str.length()-1; i>=0; i--)
			result+= str.charAt(i);
		return result;
	}
	public static void main(String args[]) {
		String inStr = "Lambda adds power to java";
		String outStr;
		outStr = stringOp(MethodRefDemo::strReverse,inStr);
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
	}
}
