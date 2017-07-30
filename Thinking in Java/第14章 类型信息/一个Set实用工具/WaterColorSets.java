package Generic;
/*
 * ·ºÐÍ 15.4.6
 *
 * EnumSet.range()
 *
 * */


import java.util.*;

public class WaterColorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);

        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union: " + Sets.union(set1,set2));
        Set<Watercolors> subset = Sets.intersection(set1, set2);
        System.out.println("intersection: " + subset);

        System.out.println("difference(se1,subset)");


    }

}
