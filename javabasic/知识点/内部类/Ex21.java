/**
 * �ӿ��е�Ƕ���ࣺ
 *     Ƕ����ͬʱ����ʵ��������ⲿ�ӿ�
 *
 * ͨ�����ַ�ʽ����ӿڵĲ�ͬʵ�ֿ��Թ������Ƕ����
 */

/*
 interface ClassInterface {
    void howdy();

    class Test implements ClassInterface { //Ƕ����ʵ����������ⲿ�ӿ�
        public void howdy(){}

        public static void main(String[] args){ //����֮�����ֶ�����.class�ļ�
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
        In.Nested in = new In.Nested(); //���ַ�ʽ����ʵ�ֽӿ�Ҳ�ܴ���Ƕ����Ķ���
        in.hi();
      //  Nested nn = new Nested(); //���ֱ���ʵ�ֽӿڣ���Ȼ������Ƕ����
       // nn.hi();


    }
}
*/
/*
*  Ƕ�����еľ�̬�������������������ⲿ�ӿ����ͣ�
*  �������ýӿ��еķ�������ʾ�����
*  �ӿڵ�ʵ�ֵ�ʵ�����ݸ����������
*
*  �ӿ�Ƕ���� new interface.InnerClass()
*
* */
interface In {
    String f();
    String g();
    class Nested { // Ĭ�Ͼ�̬
        static void testIn(In i){ //��̬���������������ڽӿ�����
            System.out.println(i.f()+i.g());//���ýӿ��еķ���
        }
    }

}

public class Ex21 implements In{  //�ӿڵ�ʵ��
    public String f(){return "hello";}   //��д�ӿڷ���
    public String g(){return "friend";}
    public static void main(String[] args){
        Ex21 x = new Ex21(); //����ʵ��
         In.Nested.testIn(x); // ���ö����
         new In.Nested().testIn(x);// ʹ�ö����
        Nested.testIn(x); //Ҳ�ǿ��Ե�
    }

}

