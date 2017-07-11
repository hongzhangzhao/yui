
/*
	用具体的或抽象的类，内部类是产生“多重实现继承”效果的唯一方法。
	
	一个抽象类没有被任何类所继承-一个普通类的方法回返回这个抽象类的对象-
	return new D(){};
*/

class C5 {
}

abstract class D {
	int i =10 ;
}

class Z extends C5 {
	D makeD() {

		return 	new D()	{ };


	}
}

public class MultiImplements {
	static void takesC(C5 c) {
	}

	static D takesD(D d) {
		return d;
	}

	public static void main(String[] args) {
		Z z = new Z();
		takesC(z);
		D d1 = takesD(z.makeD());
		System.out.println(d1.i);
	}
}