package com.MyJavaBase.Enums;

/**
 *
 * 枚举的枚举
 *
 * */
public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();

    }

    public Food randomSelection(){
        return Enumss.random(values);
    }


}
