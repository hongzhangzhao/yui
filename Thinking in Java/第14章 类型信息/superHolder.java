package Generics;

/**
 * 15.10.1
 */


public class Holder <T>{
    private T value;
    public Holder(){}
    public Holder(T val){
        value = val;
    }
    public void set(T val){
        value = val;
    }
    public T get(){
        return value;
    }

    public boolean equals (Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<Apple>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);

        //Holder<Fruit> fruitl = Apple; //on
        Holder<? extends Fruit> fruit = Apple; //ok

        Fruit p = fruit.get();
        d = (Apple)fruit.get(); //return Object

       // fruit.set(new Apple()); //no
       // fruit.set(new Fruit());
        System.out.println(fruit.equals(d));





    }


}
