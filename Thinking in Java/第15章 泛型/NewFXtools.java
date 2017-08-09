package Generics;

/**
 * 15.4.1
 *
 *
 *
 */

import java.util.*;

public class NewFXtools {

    public static <K, V> Map<K, V> map() {

        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {

        return new ArrayList<T>();
    }

    public static <T> List<T> listl() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set(){
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue(){
        return new LinkedList<T>();
    }

    public static void main(String[] args) {

        Map<String, List<String>> mm = NewFXtools.map();
        Set<String> ss = NewFXtools.set();
    }
}
