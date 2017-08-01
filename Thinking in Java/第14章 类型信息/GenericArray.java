package Generics;

/**
 * 15.8.2 Generic Array
 *
 *
 */
public class GenericArray<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    GenericArray(int size){
        array = (T[])new Object[size];
    }

    public void put(int index,T item){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }

    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> ga = new GenericArray<>(10);

        //Integer[] ig = ga.rep(); //ClassCastException

        Object[] oa = ga.rep(); // This ok
    }

}
