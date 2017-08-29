package com.MyJavaBase.Enums;

/**
 * 19.10.2 使用enum的状态机
 *  自动售货机
 * */
import java.util.*;

public enum Input {
    NICKEL(5),DIME(10),QUARTER(25),DOLLAR(100),TOOTHPASTE(200),CHIPS(75),SODA(100),SOAP(50),

    ABORT_TRANSACTION {
        public int amount(){
            throw new RuntimeException("ABORT.amount()");
        }
    },

    STOP {
      public int amount () {
          throw new RuntimeException("SHUT_DOWN.amount()");
      }
    };
    int value;
    Input(int value) { this.value = value; }
    Input(){}
    int amount() { return value; }
    static Random rand = new Random(47);
    public static Input randomSelection(){
        return values()[rand.nextInt(values().length - 1)];
    }

}
