package Generics;

/**
 * Created by Kris on 2017/8/3.
 */

import typeinfo.pets.*;
import java.util.*;

public class CheckedList {
    static void oldStyleMethod(List probablyDogs){
        probablyDogs.add(new Cat());

    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<>();
        oldStyleMethod(dogs1);
        System.out.println(dogs1);

        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(),Dog.class);
//        try {
//            System.out.println(dogs2);
//        }catch(Exception e){
//            System.out.println(e);
//        }
        dogs2.add(new Dog());
        System.out.println(dogs2);

        List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(),Pet.class);
        pets.add(new Cat());
        pets.add(new Dog());
        System.out.println(pets);

        List list = new ArrayList();
        list.add(new Cat());
        list.add(new Dog());


    }


}
