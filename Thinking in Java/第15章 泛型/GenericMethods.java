package Generics;

/**
 * 15.4 Generic Method
 *
 * 
 *
 */
public class GenericMethods {
    public  <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("xx");
        gm.f(gm); 
    }
}
