package com.MyJavaBase.Enums;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 *
 * 19.6 随即选取
 *
 * */

enum Activity { SITTING, LYING,STANDING, HOPPING, RUNNING, DODGING, JUMPING, FALLING,FLYING }

public class RandomTest {
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            System.out.println(Enumss.random(Activity.class) + " ");
        }
    }

}
