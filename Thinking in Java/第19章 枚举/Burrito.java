package com.MyJavaBase.Enums;
import static com.MyJavaBase.Enums.Spiciness.*;
/**
 *
 * 静态导包
 *
 * */
public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree = degree;
    }

    public String toString(){
        return "Burrito is " + degree;
    }
    public static void main(String[] args){
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(DEDIUM));
        System.out.println(new Burrito(HOT));
    }

}
