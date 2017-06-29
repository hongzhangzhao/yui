/*
	main方法写在了内部类中，编译好文执行的时候-
	java Y$N  这个是内部类文件的名字


*/


public class y {

	y() {


	}

	void f() {
		System.out.println("f()");
	}

	public static class Tester {
		public static void main(String[] args) {
			y t = new y();
			t.f();
		}

	}


}
/*
	class b {

	public static void main(String[] args){

		y l =new y();

		l.f();
	}

	}
	*/