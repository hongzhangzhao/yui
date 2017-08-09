package Generics;

/**
 * 15.8.2
 *
 *
 */
class Generic1<T>{}

public class ArrayOfgeneric {
    static final int SIZE = 100;
    static Generic1<Integer>[] gia;

   // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
       //gia = (Generic1<Integer>[]) new Object[SIZE](Generic1<Integer>[]);
        //ClassCastException

        gia = (Generic1<Integer>[])new Generic1[SIZE];//转型警告
        System.out.println(gia.getClass().getSimpleName());

//        gia = new Generic1[SIZE];
//        System.out.println(gia.getClass().getSimpleName());

        gia[0] = new Generic1<Integer>();

       // gia[1] = new Object();
        //gia[2] = new Generic1<Double>();
        gia[3] = new Generic1<Integer>();
    }

}
