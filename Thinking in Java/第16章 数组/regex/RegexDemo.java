package com.MyJavaBase.Arrays;
/*
*
* 通过符号来表示字符串
*
* */
public class RegexDemo {


    public static void main(String[] args) {
        /*
        *
        *  需求：队qq号效验
        *  要求：长度5-15 只能是数字，0不能开头
        * */
        /*
        * 第一步先定义 正则
        * 第一个中括号代表第一位数字是1-9
        * 第二个中括号代表第二位数字是0-9
        * 第三个大括号代表从第二位开始之后会出现4-14个第二位的中括号会出现的0-9的数字
        *
        * */
        String regex = "[1-9][0-9]{4,14}";

        String qq = "1234567"; //用户输入的qq号码

        //要效验的字符串调用匹配方法传入正则的参数进行匹配：
        boolean b = qq.matches(regex);
        //字符串如果符合规则会返回true
        System.out.println(b);

        /*
        * 数量词
        *
        * */

        String str = "aoob";
        String reg = "ao?b";  // o 出现一次或一次也没有，不符合规则
        boolean b1 = str.matches(reg);

    }

}
