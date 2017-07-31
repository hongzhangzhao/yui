package Generics;

/**
 * 15.7.4 边界处的动作
 *
 *
 *
 */

import java.lang.reflect.*;
import java.util.*;

public class ArrayMaker<T> {
    private Class<T> kind;
    public ArrayMaker(Class<T> kind){
        this.kind = kind;
    }
    @SuppressWarnings("unchecked")
    T[] create(int size){
        return  (T[])Array.newInstance(kind,size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> am = new ArrayMaker<>(String.class);
        String[] stringArray = am.create(9);
        System.out.println(Arrays.toString(stringArray));
    }

}
