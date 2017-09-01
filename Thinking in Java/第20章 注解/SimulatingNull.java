package Annotations;
import java.lang.annotation.*;
/**
 * 20.2.2 默认值限制
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
    public int id() default -1;
    public String description() default "";
}
