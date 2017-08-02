package Generics;

/**
 *
 * 15.12.2
 *
 *
 */

class SelfBounded<T extends SelfBounded<T>>{
    T element;
    SelfBounded<T> set(T arg){
        element = arg;
        return this;
    }
    T get(){
        return element;
    }
}

class AA extends SelfBounded<AA>{}
class BB extends SelfBounded<AA>{}


public class SelfBounding {


}
