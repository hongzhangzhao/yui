/*
	在子类的构造函数中，java 会自动插入父类的构造函数的调用.
	
	默认只会调用无参数的构造方法。
*/

class  A {

    A() {
        System.out.println("A");
    }
}
class B extends A {

    B() {
        super();  // A();
        System.out.println("B");
    }


}
public class C extends B {
	/*
		即使这里不创建构造方法，结果也是一样的,
		因为编译器会自动合成一个默认构造函数并发出
		对父类构造函数的调用。
	*/
    C() {    
        super(); // B();
        System.out.println("C");
    }
    
	public static void main(String[] args){
		/*
			打印结果是 A , B ,C 
			C的构造方法调用了B的构造方法，
			B的构造方法有调了A的构造方法。
 		*/
		C c = new C(); 
	}
}