package Holding;
import java.util.*;
/**
 * 11.12
 */
public class InterfaceVsIterator {
    public static void display(Iterator<String> it){
        while(it.hasNext()){
            String s = it.next();
            System.out.print(s+" ");
        }
        System.out.println();
    }

    public static void display(Collection<String> pets){
        for(String s : pets){
            System.out.print(s+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        String[] ss = {"a","b","c","d","e","f"};
        List<String> petList = Arrays.asList(ss);
        Set<String> petSet = new HashSet<>(Arrays.asList(ss));

        display(petList);
        display(petSet);

    }

}
