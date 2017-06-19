/*
	在子类的构造函数中，java 会自动插入父类的构造函数的调用.
*/

class  A {
	
	A(){
		
	}
}
public class B extends A{
	
	B(){
		super();  // A();
		
	}
	
	
}