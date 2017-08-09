package Generics;

/**
 * 15.8.2
 * 用ArrayList实现泛型数组
 *
 */
import java.util.*;

public class ListOfGenerics<T> {
     ArrayList<T> al = new ArrayList<>();
     public void add(T item){
         al.add(item);
     }
     public T get(int n){
         return al.get(n);
     }
}
