package com.MyJavaBase.Enums;

/**
 * 19.9 使用EnumMap
 */

import java.util.*;
import static com.MyJavaBase.Enums.AlarmPoints.*;

interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints,Command> em = new EnumMap<>(AlarmPoints.class);
        System.out.println(em + "------------");

        em.put(KITCHEN, new Command() {
         public void action() {
             System.out.println("Kitchen fire!");
         }
        });

        em.put(BATHROOM, new Command(){
            public void action (){
                System.out.println("Bathroom alert");
            }
        });

        for(Map.Entry<AlarmPoints,Command> e : em.entrySet()){
            System.out.print(e.getKey() + ": ");
            e.getValue().action();
        }
        try{
            em.get(UTILITY).action();
        }catch(Exception e) {
            System.out.println(e);
        }
    }

}
