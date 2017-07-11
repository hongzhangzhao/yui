/*
    ~ "封装"
    ~ 抽象方法
    ~ 没有抽象方法的抽象类，可以防止产生任何对象
    ~ interface中的方法可以省略abstract,抽象类中的抽象方法不能省略
    ~ interface和abstract就是被用来继承的，所以方法不能有妨碍继承的修饰

 */

interface  IU {
	public static final int i = 0; //interface成员默认修饰，可以省略

}

abstract class Dad {

}
class Son extends Dad {
	void print() {
		System.out.println("Son");
	}
}
abstract class SecondDad {
	abstract void print();

}
class SecondSon extends SecondDad {
	void print() {
		System.out.println("SecondSon");
	}
}

public class Ex4 {

	public static void testPrint(Dad d) {
		((Son)d).print();//父类必须向下转型子类才能调用该方法，因为该方法是新扩展的
	}
	public static void secondTestPrint(SecondDad sd) {
		sd.print(); //动态绑定
	}
	public static void main(String[] args) {
		Son s = new Son();
		Ex4.testPrint(s);
		SecondSon ss = new SecondSon();
		Ex4.secondTestPrint(ss);

	}
}
