/**
 * Created by Kris on 2017/7/13.
 */
public class Test_1 { //相对于静态内部类，外部类非常像一个包空间


      class In{
      // private static int prop1 = 5;
       private int prop2 = 9;

        }
        public void Prop(){
           // System.out.println(In.prop1);
            System.out.println(new In().prop2);

        }
        public static void main(String[] args){
         // int i = In.prop1;
          //int ii =  new Test_1().new In().prop2;
        }
    }

class Test_2 extends Test_1.In{
    Test_2(Test_1 tt){
        tt.super();
    }
}//其它类继承内部类，优先初始化父类，但是内部类的构造器依赖于外部类对象

