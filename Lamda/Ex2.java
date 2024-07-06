/**
 * WAP that use Lamda expression
 */

@FunctionalInterface
interface Inter<T> {
	T getData(T t);
}

class Ex2 {
	public static void main(String args[]) {
		Inter<Integer> a = (n)-> {
			int result = 1;
			for(int i = n; i >= 1; i-=1)
				result *= i;
			return result;
		};
		System.out.println(a.getData(5));
		
		Inter<String> b = (n)-> {
			String str = "";
			for(int i = n.length() - 1; i >= 0; i -= 1)
				str +=n.charAt(i);
			return str;
		};
		System.out.println(b.getData("Shakti"));
	}
}
