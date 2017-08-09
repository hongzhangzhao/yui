package Holding;
import java.util.*;
/**
 *
 * 11.5
 *
 */


public class ListFeatures {
    public static void main(String[] args) {
        Random r = new Random(47);
        List<String> l = new ArrayList<>();
        l.add("z");
        l.add("g");
        l.add("d");
        l.add("o");
        l.add("j");

        String s = new String("f");

        l.add(s);
        System.out.println(l);
        l.remove(s);
        System.out.println(l);
        System.out.println(l.remove(1)+ "-----");
        System.out.println(l);

        l.add(1,"w");
        System.out.println(l);
        System.out.println(l.indexOf("w"));//获取元素的角标,可以有重复元素，所以返回的是首次出现的
        System.out.println(l.indexOf(1)); //要是通过角标来获取元素 Error

        List ll = l.subList(0,1); //返回一个字串闭区间到开区间
        l.containsAll(ll); //参数是Collection,不在乎顺序


        l.set(2,"n");
        l.addAll(1,ll);
        String[] s1 = new String[2];
        String[] s2 = l.toArray(s1);
        System.out.println(Arrays.toString(s2));
    }
}
