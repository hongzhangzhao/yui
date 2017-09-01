package DeepHolding;
import java.util.*;
/**
 *
 */
public class DIYMap  {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

    public void put(Integer x , Integer y){
        l1.add(x);
        l2.add(y);
    }
    public Integer get(Integer in){
       int  i =  l1.indexOf(in);
       return l2.get(i);
    }


    public int size(){
        return l1.size();
    }
    public boolean isEmpty(){
        return l1.isEmpty();
    }
    public void clear(){
        l1.clear();
        l2.clear();
    }
    public Integer remove(Integer in){
        int i = l1.indexOf(in);
        l1.remove(i);
       return  l2.remove(i);

    }
    public Set keySet(){
        return new HashSet(l1);
    }
    public static void main(String[] args) {
        DIYMap diy = new DIYMap();
        diy.put(1,10);
        diy.put(2,20);
        diy.put(3,30);

        System.out.println(diy.get(1));
        System.out.println(diy.size());
        System.out.println(diy.isEmpty());
        System.out.println(diy.remove(3));
        Set set = diy.keySet();
        System.out.println(set);

        System.out.println(diy.l1);

    }



}
