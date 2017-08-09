package Generics;

import java.lang.reflect.Array;

/**
 * 15.8
 *
 *
 */
public class GenericArrayWithTypeToken<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type,int sz){
        array = (T[]) Array.newInstance(type,sz);
    }

    public void put(int index, T item){
        array[index] = item;
    }

    public T get(int index){
        return  array[index];
    }

    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gt = new GenericArrayWithTypeToken<>(Integer.class,10);

        Integer[] ia = gt.rep(); //可以返回
    }

}
