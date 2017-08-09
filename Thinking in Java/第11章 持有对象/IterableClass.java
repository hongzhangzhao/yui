package Holding;
import java.util.*;
/**
 *
 */
public class IterableClass implements Iterable<String> {

    String[] s = "asdfasdfsa".split("");

    public Iterator<String> iterator(){
        return new Iterator<String>(){
            private int index = 0;
            public boolean hasNext(){
                return index < s.length;
            }
            public String next(){
                return s[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }


        };

    }

    public static void main(String[] args) {
        for(String s : new IterableClass()){
            System.out.println(s);
        }
    }
}
