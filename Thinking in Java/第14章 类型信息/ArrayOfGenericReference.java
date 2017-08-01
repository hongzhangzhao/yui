package Generics;

/**
 * 15.8.2
 * 泛型数组
 *
 */

class Generic<T>{}

public class ArrayOfGenericReference {
    static Generic<Integer> [] gia;
    //能编译，不能运行
}
