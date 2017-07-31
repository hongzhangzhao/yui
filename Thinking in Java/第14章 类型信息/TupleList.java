package Generics;

/**
 *
 *  generics  15.6
 *
 *  泛型重要好处 简单安全构建复杂模型 比如 List元组
 *
 *
 *
 */

import java.util.*;

class Vehicle1{}
class Amphibian1{}

class TupleTest {
    static FourTuple<Vehicle,Amphibian,String,Integer> h(){
       return new FourTuple<Vehicle,Amphibian,String,Integer>(new Vehicle(),new Amphibian(),"hello",47);
    }
}

class FourTuple<A,B,C,D>{
    A a;
    B b;
    C c;
    D d;
    FourTuple(A a,B b,C c,D d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public String toString(){
        return a + " "+ b +" " + c + " " + d;
    }
}

public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>>{

    public static void main(String[] args) {
        TupleList<Vehicle,Amphibian,String,Integer> tl = new TupleList<>();
        tl.add(TupleTest.h());
        tl.add(TupleTest.h());
        for(FourTuple<Vehicle,Amphibian,String,Integer> i : tl){
            System.out.println(i);
        }

    }
}
