package Generics;

/**
 * simple generic  15.2
 *
 *
 *
 *
 */

class Automobile {
}

public class Holder<T> {  

    /* One
    private Automobile a;
    Holder(Automobile a){
        this.a = a;
    }

    Automobile get(){
        return a;
    }
    */
    /* Two
    private Object a1;
    public Holder(Object a){
        this.a1 = a1;
    }
    public void set(Object a){
         this.a1 = a1;
    }
    public Object get(){
        return a1;
    }
    */

    private T a2;

    public Holder(T a) {
        this.a2 = a2;
    }

    public void set(T a) {
        this.a2 = a2;
    }

    public T get() {
        return a2;
    }

    public static void main(String[] args) {
        //  Holder hz1 = new Holder(new Automobile());
        //  Automobile am =(Automobile)hz1.get();              
        Holder<Automobile> hz2 = new Holder<>(new Automobile());

    }

}
