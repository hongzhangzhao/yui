package Arrays;

/**
 * 16.7.3
 * 反序
 *
 */
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12],CompType.generator());
        System.out.println(Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

    }

}
