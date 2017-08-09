package Generics;

/**
 *
 * 15.10.1
 *
 */
import java.util.*;

public class Compilerintelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0);

        System.out.println(flist.contains(new Apple())); //argument is Object
       int i = flist.indexOf(new Apple());   // argument is Object
        System.out.println(i);
    }

}
/*
*   false
*   -1
*
* */