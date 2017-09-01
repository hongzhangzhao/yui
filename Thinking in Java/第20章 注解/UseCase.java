package Annotations;
import java.lang.annotation.*;
/**
 * 20.1.1
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    public int id();
    public String description() default "no description";
}
