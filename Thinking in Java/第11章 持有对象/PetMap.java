package Holding;
import java.util.*;
/**
 * 11.10
 *
 *
 */
public class PetMap {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(1,"rat");
        m.put(2,"cat");
        m.put(3,"dog");
        m.put(4,"pig");

        System.out.println(m);

        System.out.println(m.containsKey(5));
        System.out.println(m.containsValue("pig"));



    }


}
