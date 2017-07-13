/**
 * 添加内部类和外部类被实现的接口，和外部类的接口没有关系；
 * 接口与接口的实现完全独立
 *
 *
 *
 */

interface Incrementable{
    void increment();
}//一个接口包含一个方法

class Callee1 implements Incrementable{
    private int i = 0;

    public void increment(){
        i++;
        System.out.println(i);
    }
}   //实现了上面的接口，覆盖方法增量域

class MyIncrement{
    public void increment(){System.out.println("Other operation");}
    static void f(MyIncrement mi){  //自身的类型.调用自身方法
        mi.increment();
    }
}  //

class Callee2 extends MyIncrement{ //实现上面的自调类
    private int i = 0;
    public void increment(){  //重写父类方法，增量域；
        super.increment();  //在调用父类的方法
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable{ //内部类实现上面的接口
        public void increment(){   // 实现方法
            Callee2.this.increment(); //方法中调用外部类的同名方法
        }
    }
    Incrementable getCallbackReference(){ //返回被实现接口引用
        return new Closure();
    }
}   //

class Caller{
    private Incrementable callbackReference; //声明上面接口类型变量；
    Caller(Incrementable cbh){   //构造器给变量初始化；
        callbackReference = cbh;
    }
    void go(){   // 变量调用自身方法
        callbackReference.increment();
    }
}  //

public class Callbacks {

    public static void main(String[] args){
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();

    }
}
