import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Changes {
	String change();
	String madeBy();
	String madeOn();
}