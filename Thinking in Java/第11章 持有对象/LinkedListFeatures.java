package Holding;
import java.util.*;
/**
 * 11.7
 */
public class LinkedListFeatures {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");
        //System.out.println(ll.remove());
        ll.addFirst("99");
        System.out.println(ll);
        ll.addLast("88");
        ll.removeLast();
        System.out.println(ll);
    }
}
