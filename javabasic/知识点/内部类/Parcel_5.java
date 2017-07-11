package com.basic;
/*
 *  局部内部类
 * 
 * 
 * */

interface Destination {
	String readLabel();
}

interface Contents {
	int value();
}

public class Parcel_5 {
	class PDestination{} //和局部类名字不会冲突
	
	public Destination dest(String s){
		//PDestination属于所在方法，不属于类，只能在方法内部访问
		class PDestination implements Destination{
			private String label;
			private PDestination(String ss){
				label = ss;
			}
			public String readLabel(){
				return label;
			}
		}
		return new PDestination(s);
		
	}
	public static void main(String[] args){
		Parcel_5 p5 = new Parcel_5();
		Destination d = p5.dest("hong");
		String st = d.readLabel(); //方法执行完毕，也可调用PDestination(局部类依然存在)
		System.out.println(st);
	}
}