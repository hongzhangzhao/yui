package Arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.RandomGenerator;

import java.util.*;

/**
 * 在以排好序的数组中查找元素
 *
 *
 */
public class ArraySearching {

    public static void main(String[] args) {
        int[] i = {5,4,7,2,1,};
        Arrays.sort(i);
        System.out.println(Arrays.toString(i));
        int a = 4;
        System.out.println(Arrays.binarySearch(i,1));
        String[] sa = {"b","B","d","D","c","C","a","A","G","g"};
        Arrays.sort(sa,Collections.reverseOrder());
        System.out.println(Arrays.toString(sa));



    }

}
