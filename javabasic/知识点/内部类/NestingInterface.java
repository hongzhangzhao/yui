/*
	内部类实现其他内部接口- implements 外部类名点上内部接口名-
	内部类其中必须重写内部接口中的方法
*/

class A {

	interface B {
		void g();
	}
}

class C {

	class D implements A.B {

		public void g() {
			
			
		}
	}
}