package Holding;
import java.util.*;
/**
 *
 */
class ReversibleArrayList<T> extends ArrayList<T>{
    public ReversibleArrayList(Collection<T> c){
        super(c);
    }

    public Iterable<T> reversed(){ //Iterable
        return new Iterable<T>(){  //Iterable

            public Iterator<T> iterator(){ //or

                return new Iterator<T>(){ //or

                    int index = size() - 1;
                    public boolean hasNext(){
                        return index > -1 ;
                    }
                    public T next () {
                        return get(index--);
                    }
                    public void remove () {
                        throw new UnsupportedOperationException();
                    }

                };
            }


        };


    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> a = new ReversibleArrayList<>(Arrays.asList("iwenfkfd".split("")));
        for(String s : a){
            System.out.print(s+" ");
        }
        System.out.println();
        for(String s : a.reversed()){
            System.out.print(s+ " ");
        }




    }


}
