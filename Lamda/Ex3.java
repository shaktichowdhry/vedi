/**
 * WAP that use lambda as an argument
 */

@FunctionalInterface //has only one method
interface MyInter<T>{
	T getData(T t);
}

class Ex3 {
	//abhi khud static function bna rhe h baad mai java ka use karenge
	static String stringOp(MyInter<String> i, String str) {
		return i.getData(str); 	//function ka return type hoga coding ka return type
	}
		
	public static void main(String args[]) {	
		String in = "Lambda adds power to java";
	       	String out;
		System.out.println("Input string: " + in);
		out = stringOp((n)-> n.toUpperCase(), in); // argument k andar coding pass karre  
		System.out.println("String in uppercase: " + out);	
		
		out = stringOp((n)-> {   //variable k andar coading daal rhe h or baad mai var ko parameter mai pass karenge
			String result = "";
		       	for(int i = n.length() - 1; i >= 0; i -= 1)
				result += n.charAt(i);
			return result;	
		},in);
		System.out.println("Reversed string: " + out);

		System.out.println("String without spaces: " + stringOp((n)-> { //bina variable mai store karre  
			String result = "";
			for(int i = 0; i < n.length(); i += 1)
				if(!(n.charAt(i) == ' '))
					result += n.charAt(i);
			return result;
		},in));
	}
}
