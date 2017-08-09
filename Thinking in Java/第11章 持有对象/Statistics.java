package Holding;
import java.util.*;
/**
 * 11.10 Map
 *
 */
public class Statistics {
    public static void main(String[] args) {
       Random r = new Random(47);
       Map<Integer,Integer> m = new HashMap<>();

       for(int i=0;i<10000;i++){
          int c =  r.nextInt(20);
          Integer ig = m.get(c); //如果列表中没有对象键将放回Null(第一次是肯定没有了)
            //
           m.put(c,ig == null ? 1 : ig + 1);

       }
        System.out.println(m);
    }

}
