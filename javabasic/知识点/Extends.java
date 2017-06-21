/*
	隐藏是针对成员变量和static方法的
	覆盖针对一般方法-动态绑定
	
*/


class A extends Object {
    int x=8;

    void print() {
        System.out.println("A");
    }
    void hello() {

        System.out.println("hello");
    }
    public String toString() {

        return "" + a;
    }

    static void method() {

    }
	void method_1() {
		
	}
}

class B extends A {
	
	int x=10; //属性只能被隐藏，不能被覆盖，要通过super调用父类的属性
    /*
    	1,覆盖父类方法：名字和参数类型相同(参数不能是子类)
    	2,访问修饰符权限要比父类大或相同
    	3，返回值比父类小？
    */
    void print() { 
        Sytem.out.println("B");
        super.print();//可以通过super调用被覆盖的父类方法
    }

    void method() {//子类一般方法不能覆盖父类static方法

    }
	static void method_1() {//子类static方法不能覆盖父类一般方法
		
	}
}

class Test {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.toString());
		A a = (A)b;
		a.print(); //子类转换成父类,调相同方法执行的是子类的方法(覆盖)
		System.out.println(a.x);//打印的是父类的值(隐藏)
    }

}