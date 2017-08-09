package Generics;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

/**
 * 15.8.2
 *
 *
 */
public class GenericArray2<T> {
    private Object[] array;

    GenericArray2(int size){
        array = new Object[size];
    }

    public void put(int index,T item){
        array[index] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T)array[index];
    }

    @SuppressWarnings("unchecked")
    public T[] rep(){
        return (T[])array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> ga = new GenericArray2<>(10);

        for(int i=0;i<10;i++){
            ga.put(i,i);
        }
        for(int i=0;i<10;i++){
            System.out.print(ga.get(i) + " ");
        }
        System.out.println();

        try{
            Integer[] ia = ga.rep();
        }catch(Exception e){
            System.out.println(e);
        }

    }

}
