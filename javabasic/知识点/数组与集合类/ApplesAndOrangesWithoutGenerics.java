package com.basic;

import java.util.*;

/*
 * 1.如果一个类没有明确继承哪个类，这个类会自动继承Object类
 * 2.ArrayList可以传不同类型的对象
 * 3.ArrayList参数类型是Object,别忘记取出的对象要向下转型才能调用方法
 * 4.泛型是指定参数的类型，并且只可以传指定类型的对象
 * 5.get()不是把对象从列表中拿出来，列表中就没有这个对象了
 * 6.当定义泛型的列表取出元素，会自动把类型转换成泛型定义的类型
 * 7.泛型也适用向上转型
 * 
 * 
 * */

class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}

class Orange {
}

public class ApplesAndOrangesWithoutGenerics {

	public static void main(String[] args) {

		@SuppressWarnings("unchecked") // 会抑制一些警告信息

		ArrayList<Apple> apples = new ArrayList<>();// 泛型
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());

		}
		apples.add(new GrannySmith()); //向上转型
		apples.add(new Braeburn());

		for (int i = 0; i < apples.size(); i++) {

			// ((Apple)apples.get(i)).id(); //里面有Orange类，不能转成Apple类型

			// apples.get(i).id(); // 泛型了
		}

		apples.add(1.0); // 自动装箱
		double db = (double) apples.get(3);// 自动拆箱
		System.out.println(db);
		// foreach
		// for (Apple p : apples) {
		// p.id();
		// }

	}

}