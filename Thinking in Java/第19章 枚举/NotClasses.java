package com.MyJavaBase.Enums;

/**
 * 19.10
 */

enum LikeClasses {
    WINKEN {
        void behavior() {
            System.out.println("Behavior1");
        }
    },
    BLINKEN {
        void behavior() {
            System.out.println("Behavior2");
        }
    },
    NOD {
        void behavior() {
            System.out.println("Behavior3");
        }
    };

    abstract void behavior();
}

public class NotClasses {
    //void f1(LikeClasses.WINKEN instance){ }  //未知类，没有经过运算得到LikeClasses,而是把WINKEN当作内部类了


}
