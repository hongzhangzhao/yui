package Generics;

/**
 * 15.7.4
 *
 *
 *
 * */

import java.util.*;
public class ListMaker<T> {
    List<T> create(){
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<>();
        List<String> list = stringMaker.create();

    }
}
