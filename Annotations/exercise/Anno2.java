import java.lang.reflect.*;

class Anno2 {
	public static void main(String args[]) {
		Student s = new Student();
		try {
		Method m = s.getClass().getMethod("acceptData");
		if(m.isAnnotationPresent(Special.class));
			System.out.println("Special annotation is present in acceptData method.");

		m = s.getClass().getMethod("showData");
		if(m.isAnnotationPresent(Special.class));
			System.out.println("Special annotation is present in showData method.");
		}
		catch(NoSuchMethodException exe) {
			System.out.println("Method Not Found.");
		}
	}
}