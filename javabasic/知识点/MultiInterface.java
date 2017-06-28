/*
	类可以实现多个接口的两种方法
	
	匿名内部类就是一个大括号后边加的分号- {};
	
	使用匿名内部类必须继承一个类或者实现一个接口；
*/

interface A3 {

}

interface B {
void pp();
	

}

class X implements A3,B {
public void pp(){
	System.out.println("X");
}
}


class Y implements A3 {
	B makeB() {
		return new B() { public void pp(){System.out.println("B");}};
	}
}

public class MultiInterface {

	static void takesA(A3 a) {
		
	}

	static void takesB(B b) {

	}

}

/*
	X x = new X();
		Y y = new Y();
		
		MultiInterface.takesA(x);
		MultiInterface.takesA(y);
		MultiInterface.takesB(x);
		MultiInterface.takesB(y.makeB());
*/