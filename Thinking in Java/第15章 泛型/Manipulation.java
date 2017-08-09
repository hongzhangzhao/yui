package Generics;

/**
 * 15.7.1
 *
 *
 */
 class HasF {

    public void f(){
        System.out.println("Hash.f()");
    }

}
/*
class Manipulator<T> {
     private T obj;
     public Manipulator(T x){
         obj = x;
     }
     public void manipulate() {
         obj.f();
     }

}
*/
class Manipulator1<T extends HasF> {
    private T obj;
    public Manipulator1(T x){
        obj = x;
    }
    public void manipulate() {
        obj.f();
    }

}

public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator1<HasF> manipulator = new Manipulator1<>(hf);
        manipulator.manipulate();
    }
}

