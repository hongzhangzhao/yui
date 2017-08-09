package Holding;

import java.util.*;

/**
 *
 *
 */
public class MultiIterableClass extends  IterableClass {
    public Iterable<String> reversed(){
        return new Iterable<String> (){
            public Iterator<String> iterator(){
                return new Iterator<String>(){
                    int index = s.length -1;
                    public boolean hasNext(){
                        return index > -1;
                    }
                    public String next(){
                        return s[index--];
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }

                };
            }
        };

    }

    public Iterable<String> randomized(){
        return new Iterable<String>(){
            public Iterator<String> iterator(){
                List<String> shuffled = new ArrayList<>(Arrays.asList("qwert".split("")));
                Collections.shuffle(shuffled);
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass m = new MultiIterableClass();
        for(String s : m){
            System.out.print(s + " ");
        }
        System.out.println();
        for(String s : m.reversed()){
            System.out.print(s+" ");
        }
        System.out.println();
        for(String s : m.randomized()){
            System.out.print(s+" ");
        }

    }

}
