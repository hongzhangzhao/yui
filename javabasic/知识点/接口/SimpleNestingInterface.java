/*
	一个接口中的内部类，在接口中定义了这个类的对象-
	此时这个对象就是这个接口的变量了，而接口的变量都是-
	public static final 类型的，不能重新再赋值； @	
	
	接口也是一种特殊意义上的“类”，它里面的成员可以直接通过-
	’接口名‘进行调用。 @@
	
	
	接口中的内部类如果是在其它类中创建的对象，则这个对象-
	就不属于接口的成员，所以也就可以重新给这个对象赋值 @@@
	
	如果内部类是 static的 创建这个对象就可以是 new W.N(),建立对象，
	如果不是，只能 new w().new N(),用外部类的对象去点上内部类的对象。
	
*/


interface A {
	interface B {
	}
}

class C {
	interface D {
	}

	class H implements D {
		public void h() {
			System.out.println("H");
		}
	}
}

interface E {
	class F {
		static void print() {
			System.out.println("E.F.print()");
		}
	}

	F f = new F();
	
	
	E.F eef = new E.F();
	
	
	class G extends F {
	}
}

public class SimpleNestingInterface {

	public static void main(String[] args) {
		
		
		E.f.print();  // @@
		//E.f = new E.F(); //错误 @
		
		E.eef.print();
		
		//E.eef = new  E.F();//not

		E.F etRoot = new E.F();//@@@
		
		etRoot = new E.F();//@@@
		
		etRoot.print();
		
		
	}
}