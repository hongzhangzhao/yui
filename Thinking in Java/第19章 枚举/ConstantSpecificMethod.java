package com.MyJavaBase.Enums;
/**
 * 19.10 常量相关的方法
 *
 *
 * */
import java.util.*;
import java.text.*;

public enum ConstantSpecificMethod {
    DATE_TIME {
        String getInfo(){
            return
                    DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH {
        String getInfo(){
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        String getInfo(){
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for(ConstantSpecificMethod c : values()){
            System.out.println(c.getInfo());
        }

    }


}
