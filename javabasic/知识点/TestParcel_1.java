/*
 * �ڲ���������ת��
 * ˽�г�Ա�����ڱ����з��ʣ��������ҲҪ�ڱ����вſ���ֱ�ӷ���˽�г�Ա��
 *
 *
 *
 */
interface Contents{
    int value();
}
interface Destination{
    String readLabel();
}

class Parcel_4{

    // ����ת��֮��private����������ת�ͣ�(Parcel_4.PContents)
    private class PContents implements Contents{ //ʵ��������ӿڣ�private
        private int i = 11;   //�ڲ���ĳ�ԱҲ����˽�л�
        public int value(){ return i;}
    }
    protected class PDestination implements Destination{ //ʵ��������ӿڣ�protected
        private String label; //can't static , can static final
        private PDestination(String s){
            label = s;
        }
        public String readLabel(){
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);  //�ڲ�������ת�͵�������
    }
    public Contents contents(){
        return new PContents();      //�ڲ�������ת�͵�������
    }
}
public class TestParcel{
    public static void main(String[] args){
        Parcel_4 p = new Parcel_4();
        Contents c = p.contents();
        Destination d = p.destination("hong");
        System.out.println();

        Parcel_4.PDestination pp = (Parcel_4.PDestination)d; //����ת��
    }
}
