package Annotations;
import java.lang.annotation.*;

/**
 * 20.2.3  生成外部文件
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";

}
