package DeepHolding;

import java.util.*;

/**
 * 只读的List: must implements get and size method
 * 用Integer初始化
 *
 */
public class CountingIntegerList extends AbstractList<Integer> {
    private int size;
    public CountingIntegerList(int size){
        this.size = size < 0 ? 0 : size;
    }
    public Integer get(int index){
        return Integer.valueOf(index);  //返回一个指定int值的Integer实例
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(10));
        Collection list = new ArrayList(10);
        Map map = new HashMap();
       // System.out.println(list);
    }

}
/*
*  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
* */
