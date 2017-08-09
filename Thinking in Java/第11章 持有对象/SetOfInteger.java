package Holding;
import java.util.*;
/**
 * 11.9 Set
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random r = new Random(47);
        Set<Integer> s = new HashSet<>();

        for(int i=0;i<100;i++){
            s.add(r.nextInt(30));
        }
        System.out.println(s);
    }

}
