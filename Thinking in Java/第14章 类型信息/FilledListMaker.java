package Generics;

import java.util.*;


/**
 * 15.7.4
 */
public class FilledListMaker<T> {
    List<T> create(T t,int n){
        List<T> result = new ArrayList<T>();
        for(int i=0;i<n;i++){
            result.add(t);
        }
        return result;
    } //方法中的 T 会被擦除 ，编译仍可保持类型的一致性

    public static void main(String[] args) {
        FilledListMaker fm = new FilledListMaker();
        List<String> list = fm.create("Hello",10);
        System.out.println(list);
    }


}
