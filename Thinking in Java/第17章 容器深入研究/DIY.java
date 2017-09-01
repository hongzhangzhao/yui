package DeepHolding;
import java.util.*;
/**
 *
 */
public class DIY {
    Integer[] into = new Integer[1024];
    int index = 0;
    public void add(int i){
        into[index++] = i;
    }
    public void add(int i,int y){
        into[i] = y;
    }
    public Integer get(int i){
        return into[i];
    }
    public String toString(){
        return Arrays.toString(into);
    }

    public static void main(String[] args) {
        DIY dd = new DIY();
        dd.add(10);
        dd.add(11);
        dd.add(12);

        System.out.println(dd);
    }
}
