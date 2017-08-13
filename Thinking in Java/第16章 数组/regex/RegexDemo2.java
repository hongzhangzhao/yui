package com.MyJavaBase.Arrays;
import java.util.regex.*;
/*
* 正则表达式对字符串的常见操作：
1 匹配
    Stirng类中的 matches方法
2 切割
    Stirng类中的split方法
3 替换
    String类中的replaceAll()方法
4 获取
    只能用Pattern
*
*
* */
public class RegexDemo2 {

    //匹配
    public static void function_1(){
        String tel = "17600482113";
        String regex1 = "17\\d+";
       // String regex = "17600482113";  好使

        System.out.println(tel.matches(regex1));

    }
    //切割
    public static void function_2(){
        String str = "a  b    c   d";
        String[] s = str.split(" +");  //加号左边有个空格

        String str1 = "a.v.d.f.h";
        //点是特殊字符，不能用 点 去直接切
        String[] s1 = str1.split("\\.");

        String str2 = "hongggggzhannnnzhaaaa"; //切叠词
        /*
            叠词后一个字母在复用前一个字母，Java中基本的复用方式是函数，正则中用一个原括号()
            使用()会自动编号起始为1号，称之为一组
            下面的\\1 就代表(.) 1是普通字符所以要转译成代表第一组的符号 \1 在字符串中要多加一个 \
        */
        str2.split("(.)\\1+"); //后边出现了多次第一组中的内容

    }
    //替换
    public static void function_3(){
        /*
        * 替换会产生新的字符串
        *
        *
        * */
        String str = "hongggggzhannnnzhaaaa";
        //把叠词替换成 # 号 ,把符合规则的字符串替换成重新设定的字符串
        String str1 = str.replaceAll("(.)\\1+","#");
        //把重复的字符串替换成一个
        //第二个参数要使用第一个参数的组,使用 $ 数字代表第几组
        String str2 = str.replaceAll("(.)\\1+","$1");
        System.out.println(str2);
    }

    /*
        获取
        正则表达式本身也是一个对象 java.util.regex.Pattern;
       1 把正则封装成对象  Pattern p = Pattern.compile(String regex);
       2 建立匹配器对象，使用这个对象来操作字符串 Matcher m = p.matcher(Stirng str);
       3 通过Matcher对象的方法对字符串进行操作 boolean b = m.matches();
    */

    public static void function_4(){
        //获取3个连续字母的词
        String str = "da jia hao,ming tian bu fang jia!";
        String regex = "[a-z]{3}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        /*
        * 字符串和正则要先匹配，之后才能对匹配成功的字符串进行操作,
        * 但是调用find()一次只能获得一个匹配的结果;可以通过while获得所有匹配的结果
        * while(m.find()){
        *   m.group();
        * }
        * ming和tian的前三个字母也会被获得，这不是想要的结果:
        * regex要设置单词边界 String regex = "\\b[a-z]{3}\\b";
        *
        * */
        m.find(); //
        m.group();//获取匹配的子序列;只能得到 jia
    }


    public static void main(String[] args) {
        RegexDemo2.function_1();
        RegexDemo2.function_3();
    }
}
