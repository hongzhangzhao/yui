package Generics;

/**
 *
 *
 *
 */
import java.util.*;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        //传递任何对象都不好使了：
        List<? extends Fruit> flist = new ArrayList<Apple>();
        flist.add(null);
        Fruit f = flist.get(0);
        System.out.println(f);
        //flist.add(new Apple());
       // flist.add(new Object());


    }
}
