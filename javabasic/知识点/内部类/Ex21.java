/**
 * 接口中的嵌套类：
 *     嵌套类同时可以实现自身的外部接口
 *
 * 通过这种方式这个接口的不同实现可以共有这个嵌套类
 */

/*
 interface ClassInterface {
    void howdy();

    class Test implements ClassInterface { //嵌套类实现了自身的外部接口
        public void howdy(){}

        public static void main(String[] args){ //编译之后会出现独立的.class文件
            new Test().howdy();
        }
    }

}

*/
/*
interface In{
    class Nested {  //
        Nested(){
            System.out.println();
        }
    public void hi(){System.out.println("hi");}
    }
}
public class Ex20  implements In{
    public static void main(String[] args){
        In.Nested in = new In.Nested(); //这种方式不用实现接口也能创建嵌套类的对象
        in.hi();
      //  Nested nn = new Nested(); //这种必须实现接口，不然看不到嵌套类
       // nn.hi();


    }
}
*/
/*
*  嵌套类中的静态方法参数类型是所在外部接口类型，
*  它将调用接口中的方法并显示结果，
*  接口的实现的实例传递给这个方法，
*
*  接口嵌套类 new interface.InnerClass()
*
* */
interface In {
    String f();
    String g();
    class Nested { // 默认静态
        static void testIn(In i){ //静态方法，参数是所在接口类型
            System.out.println(i.f()+i.g());//调用接口中的方法
        }
    }

}

public class Ex21 implements In{  //接口的实现
    public String f(){return "hello";}   //重写接口方法
    public String g(){return "friend";}
    public static void main(String[] args){
        Ex21 x = new Ex21(); //创建实例
         In.Nested.testIn(x); // 不用对象调
         new In.Nested().testIn(x);// 使用对象调
        Nested.testIn(x); //也是可以的
    }

}

