/*
	除了接口的定义类之外，不能实现一个私有接口.
	
	内部接口不能实力化，所以默认是 static 的。
	

	
	如果一个类实现了一个接口，这个有内部接口，这个时候这个类用实现-
	这个接口中的内部接口的方法吗？
	
	System.out.println();里面不能传没有返回类型的方法
	
*/


class A2 {
    interface B {
        void f();
    }

    public class BImp implements B {
        public void f() {
            System.out.println("BImp");
        }
    }

    private class BImp2 implements B {
        public void f() {
            System.out.println("BImp2");
        }
    }

    public interface C {
        void f();
    }

    class CImp implements C {
        public void f() {
            System.out.println("CImp");
        }
    }

    private class CImp2 implements C {
        public void f() {
            System.out.println("CImp2");
        }
    }

    private interface D {
       public void f();
    }

    private class DImp implements D {
        public void f() {
            System.out.println("DImp");
        }
    }

    public class DImp2 implements D {
        public void f() {
            System.out.println("DImp2");
        }
    }

    public D getD() {
        return new DImp2();
    }

    private D dRef;
	
	public void faxing(){
		
		dRef.f();
	}

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}








interface E {
    interface G {
        void f();
    }

   
    public interface H {
        void f();
    }

    void g();
    
}








public class NestingInterface1 {
    public class BImp implements A2.B {
        public void f() {
            System.out.println("BImp implements A2.B");
        }
    }

    class CImp implements A2.C {
        public void f() {
            System.out.println("BImp implements A2.C");
        }
    }

    

    class EImp implements E {
        public void g() {
            System.out.println("EImp");
        }
    }

    class EGImp implements E.G {
        public void f() {
            System.out.println("EGImp");
        }
    }

    class EImp2 implements E {
        public void g() {
            System.out.println("EImp2");
        }

        class EG implements E.G {
            public void f() {
                System.out.println("EG");
            }
        }
    }

    public static void main(String[] args) {
        A2 a = new A2();
        
        
		A2.DImp2 g = a.new DImp2();
        
		A2 a2 = new A2();
        a2.receiveD(a.getD());
		
		//A2.D 是一个私有的接口类型，外部用不了
		//A2.D ad = a.getD();
		a2.faxing();
		
		//这个返回的是父接口类型，要向下转型下能赋值
		//A2.DImp2 di2 = a.getD();
		A2.DImp2 di2 = (A2.DImp2)(a.getD());
		di2.f();
		
		//D中的f()是在不可访问的类或接口中定义的
		//a.getD().f();
		
    }
}