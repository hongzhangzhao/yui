package Annotations;

/**
 * 20.2.3
 */
public @interface Uniquenuess {
    Constraints constraints() default @Constraints(unique = true);
}
