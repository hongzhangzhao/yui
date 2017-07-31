package Generics;

/**
 *  RandomList  15.2.3
 *
 *
 */
import java.util.*;

public class RandomListfanxing<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomListfanxing rl = new RandomListfanxing();
        for(String s : "a b c d e f g".split(" "))
            rl.add(s);
        System.out.println(rl.storage);
    }
}
