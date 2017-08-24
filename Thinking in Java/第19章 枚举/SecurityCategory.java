package com.MyJavaBase.Enums;

/**
 * 一个enum嵌套在另一个enum内
 *
 * */

public enum SecurityCategory {
    STOCK(Security.Stock.class), BOND(Security.Bond.class);

    Security[] values;

    SecurityCategory(Class<? extends Security> kind ) { //内部接口的类对象(其中的enum实现)
        values = kind.getEnumConstants();   // enum对象数组
    }

    //内部接口(enum)
    interface Security {
        enum Stock implements Security { SHORT, LONG, MARGIN }
        enum Bond implements Security { MUNICIPAL, JUNK }

    }

    public Security randomSelection(){
        return Enumss.random(values);
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            SecurityCategory category = Enumss.random(SecurityCategory.class);
            System.out.println(category + ": " + category.randomSelection());
        }
    }

}
