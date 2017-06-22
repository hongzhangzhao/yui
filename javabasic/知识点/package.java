package com.hongz.test; //package必须定义在代码的最上面

import com.hongz.test.Class; //导入某某包中的类，以便在当前类中调用import类中的方法

/*
	javac God.java 能通过编译,但是生成的class文件在当前目录，没有到指定的包中
	java God 找不到,把class文件放到指定包中在运行 java com.hongz.test.God
	
	javac -d . God.java:
		会在当前目录下生成一个包，并把class文件自动放到指定包中
*/

public class God { 
	
	public static void main(String[] args) {
		
		Class.method();
		
		Class c = new Class();
		
		c.method();
	}
	
}
