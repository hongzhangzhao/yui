/*
	protected 和 默认 变量
	不在同一个包下的情况！！
*/



import hz.hzz.Test_2;


class Main  {  //不继承的情况下
	public static void main(String[]args) {
		
		/*
			即使创建了包中类的对象，这个对象也调用不了导入类里面的
			修饰protected 和 默认类型的 变量
		*/
		Test_2 t2 = new Test_2();

		System.out.println(t2.z);

		System.out.println(t2.v);

		//Main mn = new Main();

		//System.out.println(mn.z);

		//System.out.println(mn.v);



	}
}
____________________________________________

import hz.hzz.Test_2;

class Main extends Test_2 { //继承的情况下
	public static void main(String[]args) {
		/*
			即使继承了，外部类的对象也无法调用，
			protected的变量和默认的变量
		*/
		Test_2 t2 = new Test_2();

		System.out.println(t2.z);

		System.out.println(t2.v);
		
		/*
			但是子类的对象可以调用protected类型的变量
			可是同样不无法调用默认类型的变量
		*/

		//Main mn = new Main();

		//System.out.println(mn.z);

		//System.out.println(mn.v);

	}
}
_________________________________________

package hz.hzz;

public class Test_2 {

	protected int z = 200 ;

	int v =500;
}