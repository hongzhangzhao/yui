package Generics;

/**
 * 15.4 泛型方法
 *
 * 
 *
 */
public class GenericMethods {
    public  <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethodsFX gm = new GenericMethodsFX();
        gm.f("xx");
        gm.f(gm); 
    }
}
