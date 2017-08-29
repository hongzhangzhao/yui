package com.MyJavaBase.Enums;

/**
 * 19.10
 *
 * */

public enum OverridConstantSpecific {
    NUT, BOLT,
    WASHER {
        void f(){
            System.out.println("Overriden method");
        }
    };

    void f(){
        System.out.println("default behavior");
    }

    public static void main(String[] args) {
        for(OverridConstantSpecific ocs : values() ){
            System.out.print(ocs + ": ");
            ocs.f();
        }

    }


}
