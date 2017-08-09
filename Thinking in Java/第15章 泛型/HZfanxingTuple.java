package Generics;

/**
 * Tuple Test   15.2.1
 * 一组对象打包存储到一个单一对象，容器对象，只能读，不能写
 *
 */

class Amphibian {}
class Vehicle {}

class Tuple2<A,B>{
    public final A a; // final 能够保护 public元素
    public final B b;
    Tuple2(A a,B b){
        this.a = a;
        this.b = b;
    }
}

class Tuple3<A,B,C> extends Tuple2<A,B>{
    public final C c;

    Tuple3(A a,B b,C c){
        super(a,b);
        this.c = c;
    }

    public String toString(){
        return a + "," + b +"," + c;
    }

}

//class Tuple3<A,B,C,D> extends Tuple2<A,B,C>{}


public class HZfanxingTuple {
    public static Tuple3<Amphibian,Vehicle,String> f(){
        return new Tuple3<Amphibian,Vehicle,String>(new Amphibian(),new Vehicle(),"hello");
    }

    public static void main(String[] args) {
        System.out.println(HZfanxingTuple.f());
    }

}


