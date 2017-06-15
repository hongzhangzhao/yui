/**
this 
this()必须放在构造方法里的第一句

this是对象构造过程中的一个指代，代表对象，又不是对象。

*/

public class  A {
	int ok = 0;
	
	void method(){
		System.out.println( this.ok );
		methodOne();      //普通方法可以直接调用静态方法
		this.methodOne(); //也可以使用this来调用
	}
	static void methodOne(){
		System.out.println( this.ok ); //不能在static方法内使用this(非静态)
		System.out.println( ok );   //不能在static方法内使用this(非静态)--> this可以省略
		methodTwo();  //静态方法可以调用其他静态方法
	}
	
	static void methodTwo(){
		
	}
}

class  B {
	
	void function(){
		
	}
	
	public static void main(String[] args){
		
		A.methodOne(); //静态方法可以使用类来调用
		a.methodOne(); //静态方法也可以使用对象来调用
		
		A a = new A();
		
		a.method(); //普通方法需要使用对象来调用
	//	A.method(); //普通方法不能用类名调用
	//	this.method();//不能通过this调用
		
	//	this.print(); //  这个this是指 B 的对象 而不是A的
		
	}
	
	
}