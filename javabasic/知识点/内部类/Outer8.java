package com.basic;


public class Outer8{
	class Inner{
		private int ii1 = 1;
		private int ii2 = 2;
		private void showIi2(){System.out.println(ii2);}
		private void hi(){System.out.println("Inner hi");}
	}
	
	int oi=new Inner().ii1;  //访问内部类私有成员()
	Inner in =new Inner();  
	
	void outerHi(){
		new Inner().hi();
	}
	
	public static void main(String[] args){
		System.out.println(new Outer8().oi);
		System.out.println(new Outer8().in.ii2); // !!
		new Outer8().outerHi();
	}
	
}