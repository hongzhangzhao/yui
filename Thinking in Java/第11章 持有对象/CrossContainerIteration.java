package Holding;
import java.util.*;
/**
 * 11.6
 */
public class CrossContainerIteration {
    public static void display(Iterator<String> it){
        while(it.hasNext()){
            String s = it.next();
            System.out.print(s);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("4");
        al.add("2");
        al.add("3");
        al.add("5");
        al.add("1");
        display(al.iterator());

        HashSet<String> hs = new HashSet<>();
        hs.add("4");
        hs.add("2");
        hs.add("3");
        hs.add("5");
        hs.add("1");
        display(hs.iterator());

    }

}
