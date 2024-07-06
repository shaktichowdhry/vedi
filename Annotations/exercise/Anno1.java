import java.lang.reflect.*;

class Anno1 {
	public static void main(String args[]) {
		Student s = new Student();
		try {
		What an = s.getClass().getAnnotation(What.class);
		System.out.println(an.description());

		Method m = s.getClass().getMethod("acceptData");
		an = m.getAnnotation(What.class);
		System.out.println(an.description());

		an = s.getClass().getMethod("showData").getAnnotation(What.class);
		System.out.println(an.description());
		
		Gender g = Gender.MALE;
		an = g.getClass().getAnnotation(What.class);
		System.out.println(an.description());
	
		an = g.getClass().getMethod("acceptGen").getAnnotation(What.class);
		System.out.println(an.description());

		House h = House.PALASH;
		an = h.getClass().getAnnotation(What.class);
		System.out.println(an.description());
	
		an = h.getClass().getMethod("acceptHouse").getAnnotation(What.class);
		System.out.println(an.description());

		an = s.getClass().getMethod("main", String[].class).getAnnotation(What.class);
		System.out.println(an.description());
		}
		catch(NoSuchMethodException exe) {
			System.out.println("Method Not Found.");
		}
	}
}