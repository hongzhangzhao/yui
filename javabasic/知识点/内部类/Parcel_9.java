package com.basic;
/*
 *   内部类成员初始化(局部类)
 * 	 
 * 
 * */

interface Demo_20 {

	int value();

}

public class Parcel_9 {
	public Demo_20 moon(final int i) { //匿名类调用参数必须final
		return new Demo_20() {
			private int z = i; //参数用来给字段初始化

			public int value() {
				return z;
			}
		};

	}

	public static void main(String[] args) {
		Parcel_9 p1 = new Parcel_9();
		System.out.println(p1.moon(100).value());
	}
}