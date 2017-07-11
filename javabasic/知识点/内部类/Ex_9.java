package com.basic;
/*
 *   局部内部类和作用域内部类练习
 * 
 * 
 * */

interface Demo { // 创建一个接口
	void say(String s);
}


public class Ex_9 {
	
	Demo f(boolean b){
		if(b){
			class Test1 implements Demo{
				public void say(String s){
					
				}
				
			}
			return new Test1();
		}
		return null;
	}
	
	
	Demo d() { // 方法返回Demo类型

		class Test implements Demo { // 局部类实现Demo
			public void say(String s) {
				System.out.println(s);
			}
		}
		return new Test();

	}

	public static void main(String[] args) {
		Ex_9 qq = new Ex_9();
		Demo dd = qq.d();
		dd.say("hong");
	}
}