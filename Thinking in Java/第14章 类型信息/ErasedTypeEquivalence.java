package Generics;

/**
 *
 * 15.7  Erase
 *
   result : true
 *
 */
import java.util.*;

class A{}
class B{}

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<A>().getClass();
        Class c2 = new ArrayList<B>().getClass();

        System.out.println(c1 == c2);
    }

}
