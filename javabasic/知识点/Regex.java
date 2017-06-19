/*
	正则表达式：符合一定规则的表达式
	作用：用于专门操作字符串
	特点：用一些特定的符号来表示一些代码的操作，简化书写；
		  学习正则表达式，就是在学习一些特殊符号的使用。
	好处：可以简化对字符串的复杂操作。
	
	具体操作功能：
		1，匹配：String类中的matches方法

*/

class Test {
    /*
    	效验QQ号：
    	条件： 5~15位 ，开头不能为0 ， 只能是数字

		
		
    */
    public static void checkQQ() {

        String qq = "12345567";  //用户输入的qq号

        //规则定义：第一位数从1~9，二位从0~9，第二位数可以出现4~14个
        String regex = "[1-9][0-9]{4,14}";
	
        boolean flag = qq.matches(regex);//判断输入的qq号是否符合规则
		
        if(flag) {
            System.out.println("OK");
        } else {

            System.out.println("NO");
        }
    }


    public static void main(String[] args) {

        checkQQ();

    }


}