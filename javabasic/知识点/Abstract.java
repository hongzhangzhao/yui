/*
	final类不能有抽象方法，因为不能被继承
*/

abstract class A {//一定是父类
    A() {
        System.out.println("A");
    }
	/*
		抽象方法就是用来被重写的，
		所以不能用static,private,final修饰。
		Static是隐藏
	*/
    abstract void print() {

    }

}
class B extends A {
    B() {
        System.out.println("B");
    }
    void print() { //子类必须覆盖父类的抽象方法，否则子类也是抽象类

    }
	
	public static void main(String[] args){
		new A(); //abstract修饰的类不能实例化
		new B();
		
	}
}