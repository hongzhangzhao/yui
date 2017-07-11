package com.basic;
/*
 *   匿名内部类
 * 	 父类带参构造方法
 * 
 * */

class Demo {
	private int i;

	public Demo(int x) {// 基类带参数的构造器
		i = x;
	} 

	public int value() {
		return i;
	}
}

public class Parcel_8 {
	public Demo f(int x) {
		return new Demo(x) { //匿名类没有构造方法
			public int value(){
				return super.value() *100;
			}
		}; //分号标记表达式的结束

	}

	public static void main(String[] args) {
		Parcel_8 pp = new Parcel_8();
		int i =pp.f(10).value();
		System.out.println(i);
	}
}