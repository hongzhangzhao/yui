/*
* 内部类练习
*
*
* */

interface U {
    void f();

    void g();

    String toString();
} //一个接口包含三个方法

class A1 {
    U backU() {
        return new U() {
            public void f() {
            }

            public void g() {
            }

            public String toString() {
                return "i am u";
            }
        };
    }

}  //匿名内部类返回对U 的引用

class B1 {
    private U[] us; //声明U类型数组

    B1(int i) {   //构造器中初始化数组大小
        us = new U[i];
    }

    void addU(U u, int i) {
        us[i] = u;
    } // 添加元素

    void Unull(int i) {
        us[i] = null;
    } // 删除元素

    void testU() {
        for (U u : us) {
            u.f();
            u.g();
            u.toString();
        }
    } //foreach遍历数组，并调用方法

    void showUs() {
        for (U u : us) {
            if (u != null) System.out.println(u.toString());
            else System.out.println("I'm null");
        }
    }
}   // 判断数组中元素是否为 null

public class Ex23 {
    public static void main(String[] args) {
        A1 a0 = new A1();
        A1 a1 = new A1();
        A1 a2 = new A1();
        B1 b = new B1(3);
        b.addU(a0.backU(),0);
        b.addU(a1.backU(),1);
        b.addU(a1.backU(),2);
        b.showUs();
        b.Unull(0);
        b.showUs();

    }
}