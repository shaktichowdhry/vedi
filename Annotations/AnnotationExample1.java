import java.lang.annotation.*; //used for calling Retention and Retentionpolicy
import java.lang.reflect.*; //Reflection api, calls "Method" class

//these are called Meta data 
@Retention(RetentionPolicy.RUNTIME) //tells at when annotation gets discarded (RUNTIME- source + class + jre) //default -CLASS
@interface MyAnno {
	String str(); //Multi-Member annotaion
	int val();
}

class AnnotationExample1 {
	@MyAnno(str = "Annotation Example", val = 100) //giving values to the functions
	public static void myMeth() {
		//now we want to access values of MyAnno
		//object-->class-->Method-->Annotaion
		AnnotationExample1 ob = new AnnotationExample1();
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " " + anno.val());
		}
		catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String args[]) {
		myMeth();
	}
}	
