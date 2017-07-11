/*
	# 数组初始化
	# new object() 是表达式计算后的值(内存地址值)，给了new object()引用
*/

class Weeble {

}

public class ArraySize {

    public static void main(String[] args) {

        Weeble[] a;
        Weeble[] b = new Weeble[5]; //必须定义容量大小
        Weeble[] c = new Weeble[4];
        //b = {new Weeble(),new Weeble(),.....}; 错误
        
		//a = {new Weeble()};  错误
        a = new Weeble[] {new Weeble(),new Weeble()};

        Weeble[] d = {new Weeble(),new Weeble(),new Weeble()};

        for(int i=0; i<c.length; i++) {
            c[i] = new Weeble();
        }


        System.out.println("a.length=" + a.length);
        for(int i=0; i<b.length; i++) {
            System.out.println("b["+i+"]"+b[i]);
        }

        a=d;
        System.out.println(a.length);
    }
}