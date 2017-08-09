package Holding;
import java.util.*;
/**
 * 11.12
 */
public class CollectionSequence extends AbstractCollection<String>{

    private String[] s1 = {"a","b","c","d","e"};
    public int size(){
        return new CollectionSequence().size();
    }
    public Iterator<String> iterator(){
        return new Iterator<String>(){
            private int index = 0;
            public boolean hasNext(){
                return index < new CollectionSequence().size();
            }
            public String next(){
                return s1[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
    }

}
