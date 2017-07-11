/*
 * 内部类与向上转型
 * 私有成员是能在本类中访问，本类对象也要在本类中才可以直接访问私有成员，
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

    // 向上转型之后，private不可以向下转型，(Parcel_4.PContents)
    private class PContents implements Contents{ //实现了外面接口，private
        private int i = 11;   //内部类的成员也可以私有化
        public int value(){ return i;}
    }
    protected class PDestination implements Destination{ //实现了外面接口，protected
        private String label; //can't static , can static final
        private PDestination(String s){
            label = s;
        }
        public String readLabel(){
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);  //内部类向上转型到外面型
    }
    public Contents contents(){
        return new PContents();      //内部类向上转型到外面型
    }
}
public class TestParcel{
    public static void main(String[] args){
        Parcel_4 p = new Parcel_4();
        Contents c = p.contents();
        Destination d = p.destination("hong");
        System.out.println();

        Parcel_4.PDestination pp = (Parcel_4.PDestination)d; //向下转型
    }
}
