package Holding;
import java.util.*;
/**
 * 11.6.1
 */


public class ListIteration {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("4");
        l.add("3");
        l.add("1");
        l.add("2");
        l.add("5");
        ListIterator lt = l.listIterator();
        System.out.println(lt.previousIndex());
        System.out.println(lt.next());
        System.out.println(lt.next());
        System.out.println(lt.nextIndex());
        System.out.println(lt.previousIndex());
        System.out.println(lt.previous());
        lt.set("00");
        System.out.println(l);

    }



}
