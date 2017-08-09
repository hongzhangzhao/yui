package Holding;
import java.util.*;
/**
 * 11.6 迭代器
 */
public class SimpleIterator {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("c");
        l.add("b");
        l.add("v");
        l.add("k");
        l.add("e");
        System.out.println(l);
//        Collections.shuffle(l);
//        System.out.println(l);
        Iterator it = l.iterator();

        System.out.println(it.next());
        System.out.println(l.get(0));
//        while(it.hasNext()){
//            System.out.print(it.next());
//
//        }
//        for(int i=0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }
    }
}
