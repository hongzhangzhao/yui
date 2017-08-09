package Holding;
import java.util.*;
/**
 * 11.10
 *
 *
 */
public class MapOfList {

    public static void main(String[] args) {
        Map<Integer,List<String>> m = new HashMap<>();
        m.put(1,new ArrayList<String>(Arrays.asList("a","b","c","d")));
        m.put(2,new ArrayList<String>(Arrays.asList("e","f","g","h")));

        Collection co = m.values();
        //[[a, b, c, d], [e, f, g, h]]:
        System.out.println(co);

//        for(Integer in : m.keySet()){
//            System.out.println(in);
//            for(String s : m.get(in)){
//                System.out.println(s);
//            }
//        }

    }




}
