/*
	接口中的内部类

*/

interface IInterface {
	static class Inner{

		int i,j,k;

		public Inner() {

		}
		void f() {

		}
	}
}

/*
	内部类的继承

	内部类的对象是通过外部类的对象创建出来的

	new Wai().new Nei();

	一个类要实例化对象，就需要调用父类的构造函数，这个父类如果是-
		一个内部类，就需要外部类的对象去掉这个父类的构造函数才能-
		创建成功。
*/

class WithInner {
	class Inner {
		
		}
	}

public class InheritInner extends WithInner.Inner {
	InheritInner(WithInner wi) {
		wi.super();
		
	}
}

/*
	 WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
*/

/*
	局部静态内部类
*/

class AA {

	void print() {
		static class BB {

		}
	}
}