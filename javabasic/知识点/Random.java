import java.util.*;

public class Test {

    public static void main(String[] args) {

        Random r1 = new Random();

        r1.nextDouble(); //生成 0~1.0 区间的小数
        r1.nextDouble() * 5; //生成 0~5.0 区间的小数
        /*
        生成 1 ~ 2.5 之间的小数
        首先生成 0~1.5 区间的小数
        再 加 1 ，就是最小值加 1  ；最大值加 1 。
        */
        r1.nextDouble() * 1.5 + 1;

        r1.nextInt(); //生成任意整数
        r1.nextInt(10);//生成 0~10 区间的整数，取不到10

        /*
        	生成 0~10 区间的正整数
        	首先生成任意int数字，之后和10取余数，
        	区间为 -10 ~ 10
        	Math.abs取绝对值 0 ~ 10
        */
        Math.abs(r1.nextInt() % 10); //


        r.nextInt(18) - 3; //生成 -3 ~ 15 区间的整数

        Math.abs(r.nextInt() % 18) - 3; //生成 -3 ~ 15 区间的整数

		/*
			控制随机数的概率
		*/
        int n5 = r.nextInt(100);

        int m; //结果数字

        if(n5 < 55) { //55个数字的区间，55%的几率

            m = 1;

        } else if(n5 < 95) { //[55,95)，40个数字的区间，40%的几率

            m = 2;

        } else {

            m = 3;

        }
    }



}