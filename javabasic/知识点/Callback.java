/*
	使用内部类进行回调，
	
	接口也可以当成一个变量来使用，前提是已经被子类实现了，
	
	可以通过外部类的方法使用内部类
*/

interface Incrementable {
	void increment();
}

class Callee1 implements Incrementable {

	private int i = 0 ;

	public void increment() {
		i++;
		System.out.println(i);
	}
}





class MyIncrement {
	public void increment() {
		System.out.println("Other Operation");
	}
	public static void f(MyIncrement mi) {
		mi.increment();
	}
}






class Callee2 extends MyIncrement {

	private int i = 0;

	private void incr() {
		i++;
		System.out.println(i);
	}

	private class Closure implements Incrementable {
		public void increment() {
			incr();
		}
	}
	Incrementable getCallbackReference() {
		return new Closure();
	}
}





class Caller {

	private Incrementable callbackReference;

	Caller(Incrementable cbh) {
		callbackReference = cbh;
	}
	void go() {
		callbackReference.increment();
	}
}

/*

	Callee1 c1 = new Callee1();

		Caller caller1 = new Caller(c1);
		caller1.go();
		caller1.go();

		Callee2 c2 = new Callee2();

		Caller caller2 = new Caller(c2.getCallbackReference());

		caller2.go();
		caller2.go();
		caller2.go();
*/