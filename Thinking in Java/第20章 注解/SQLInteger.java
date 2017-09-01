package Annotations;
import java.lang.annotation.*;
/**
 * 20.2.3
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {
    String name() default "";
    Constraints constraints() default @Constraints;

}
