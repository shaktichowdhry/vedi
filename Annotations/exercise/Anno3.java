import java.lang.reflect.*;

class Anno3 {
	public static void main(String args[]) {
		Student s = new Student();
		try {
		Method m = s.getClass().getMethod("acceptData");
		Changes c = m.getAnnotation(Changes.class);
		System.out.println("change: " + c.change() + "\nmadeBy: " + c.madeBy() + "\nmadeOn: " + c.madeOn());

		c = s.getClass().getMethod("showData").getAnnotation(Changes.class);
		System.out.println("\nchange: " + c.change() + "\nmadeBy: " + c.madeBy() + "\nmadeOn: " + c.madeOn());

		c = s.getClass().getMethod("main", String[].class).getAnnotation(Changes.class);
		System.out.println("\nchange: " + c.change() + "\nmadeBy: " + c.madeBy() + "\nmadeOn: " + c.madeOn());
		}
		catch(NoSuchMethodException exe) {
			System.out.println("Method Not Found.");
		}
	}
}