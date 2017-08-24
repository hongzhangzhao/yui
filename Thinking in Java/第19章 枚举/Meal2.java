package com.MyJavaBase.Enums;
/**
 * 19.7
 *
 *
 * */


public enum Meal2 {

    //包装 Food
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] values;//### 主要是通过Meal2的对象初始化这个数组(实现枚举的所有对象)

    private Meal2(Class<? extends Food> kind ) {
        values = kind.getEnumConstants();
    }

    public interface Food { //组织接口
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS;
        }
        enum MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
        }
        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL;
        }
        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }
    }

    public Food randomSelection(){
        return Enumss.random(values);
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(Meal2 meal : Meal2.values()){
                Food food = meal.randomSelection();
                System.out.println(food);
            }
            System.out.println("--------------");
        }
    }
}
