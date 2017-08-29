package com.MyJavaBase.Enums;

/**
 * 19.8
 *
 * */

import java.util.*;
import static com.MyJavaBase.Enums.AlarmPoints.*;


public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);//指定了元素的类型，AlarmPoints中的对象没有添加进容区中
        System.out.println(points);

        points.add(BATHROOM);
        System.out.println(points);

        points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);

        points = EnumSet.allOf(AlarmPoints.class);
        System.out.println(points + "---------");
        points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);

        points.removeAll(EnumSet.range(OFFICE1,OFFICE4));
        System.out.println(points);

        points = EnumSet.complementOf(points);
        System.out.println(points);




    }

}
