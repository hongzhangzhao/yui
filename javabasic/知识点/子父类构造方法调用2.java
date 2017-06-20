
class A {

    A(int i) {

    }

}

class B extends A {
    B(int i) {

    }

}

public class C extends B {

    C() {
        /*
        	这里如果不定义会默认调用父类的无参构造函数,
        	如果父类没有重新定义无参构造方法将会出现错误，

        */
        super(11);
    }
	
	C(int i){ //默认也是调父类的无参构造函数
		
		
	}

    public static void main(String[] args) {

        C c = new C();
		C c1 = new C(2);
    }

}