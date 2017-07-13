/*
 * 嵌套类就是修饰为static的内部类
 * 含义：
 *     创建对象就不需要依赖外部类的对象了
 * 嵌套类可以包含静态字段
 *
 *
 *
 *
 *
 */
interface Contents1 {
    int value();
}

interface Destination2 {
    String readLabel();
}


public class Parcel_11 {
    private static class PPAP implements Contents1{ //嵌套类实现一个接口
        private int i = 11;
        public int value(){return i;} //覆盖接口方法
    }
    protected static class PPAP_1 implements Destination2{ //嵌套类 没有Parcel_11.this引用，类似静态方法
        private String label;
        private PPAP_1(String s){
            label = s ;
        }
        public String readLabel(){
            return label;
        }
        public static void f(){}
        static int x= 10;

        static class AnotherLevel{   //嵌套类中的嵌套类
            public static void f(){}
            static int x = 10;
        }



    }
    public static Destination2 des(String s){
        return new PPAP_1(s);
    }
    public static Contents1 contents(){
        return new PPAP();
    }
    public static void main(String[] args){
        Contents1 c = contents(); //并不需要外部类对象
        Destination2 d = des("hongz");
    }
}
