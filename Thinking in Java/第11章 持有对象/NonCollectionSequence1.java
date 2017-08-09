package Holding;

import java.util.*;

/**
 *
 */
public class NonCollectionSequence1 implements Iterable<String>{
    String[] s = "sdfsdfs".split("");

    public Iterator<String> iterator(){

        return new Iterator<String>(){
            int index = 0;
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
        NonCollectionSequence1 nc = new NonCollectionSequence1();
        for(String s : nc){
            System.out.println(s);
        }

    }

}
