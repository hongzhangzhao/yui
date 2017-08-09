package Holding;
import java.util.*;
/**
 *
 */
class PetSequence{
    protected String[] pets = "abcdef".split("");
}

public class NonCollectionSequence extends PetSequence{
    public Iterator<String> iterator(){

        return new Iterator<String>(){
            int index = 0;
            public boolean hasNext(){
                return index < pets.length;
            }
            public String next(){
                return pets[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        Iterator<String> it = nc.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    


}
