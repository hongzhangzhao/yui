package Arrays;

/**
 * 16.7.2 排序
 *
 *
 *
 */
import java.util.*;

public class ComparingArrays {
    public static void main(String[] args) {
       int[] a1 = new int[10];
       int[] a2 = new int[10];
       Arrays.fill(a1,50);
       Arrays.fill(a2,50);
       System.out.println(Arrays.equals(a1,a2));

       String[] s1 = new String[3];

       // 元素都是互相独立的对象
       String[] s2 = {new String("good"),new String("good"),new String("good")};

       Arrays.fill(s1,"good");  //是指向了同一个对象
        //虽然是指向不同的对象，但是比较是基于内容的，所以为true
        System.out.println(Arrays.equals(s1,s2));



    }

}
