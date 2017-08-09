package Generics;

/**
 *
 * 15.11.4
 *
 */
import java.util.*;

public class UseList<W,T> {
//    void f(List<T> v){}  //类型参数被擦除，没有重载
//    void f(List<W> v){}

    void f1(List<T> v){}
    void f2(List<W> v){}

}
