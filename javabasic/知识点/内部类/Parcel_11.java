/*
 * Ƕ�����������Ϊstatic���ڲ���
 * ���壺
 *     ��������Ͳ���Ҫ�����ⲿ��Ķ�����
 * Ƕ������԰�����̬�ֶ�
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
    private static class PPAP implements Contents1{ //Ƕ����ʵ��һ���ӿ�
        private int i = 11;
        public int value(){return i;} //���ǽӿڷ���
    }
    protected static class PPAP_1 implements Destination2{ //Ƕ���� û��Parcel_11.this���ã����ƾ�̬����
        private String label;
        private PPAP_1(String s){
            label = s ;
        }
        public String readLabel(){
            return label;
        }
        public static void f(){}
        static int x= 10;

        static class AnotherLevel{   //Ƕ�����е�Ƕ����
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
        Contents1 c = contents(); //������Ҫ�ⲿ�����
        Destination2 d = des("hongz");
    }
}
