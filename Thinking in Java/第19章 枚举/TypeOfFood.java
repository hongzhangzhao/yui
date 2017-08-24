package com.MyJavaBase.Enums;
/**
 *
 * 19.7
 *
 * */
import static com.MyJavaBase.Enums.Food.*;

public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }


}

