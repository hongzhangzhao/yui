/*
 * 1 可以通过外部方法，返回内部类对象
 * 2 在外部类的一般方法中可以直接定义内部类的对象，其它不可以(!!)，
 * ? 和第二条相冲
 *
 *
 *
 */




public class Parcel12 {
    class Contents{
        private int i = 11;
        public int value(){return i;}

    }
    class Destination{
        private String label;
        Destination(String s){
            label = s;
        }
        String readLabel(){return label;}
    }

    public Destination to(String s){ // 1
        return new Destination(s);
    }

    public Contents con(){  // 1
        return new Contents();

    }

    public void ship(String s){
        Contents c = con();    // 2
        Destination d = to(s);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
        Parcel12 p = new Parcel12();
        p.ship("hongz");
        Parcel12.Contents pc = p.con(); // !!
        Parcel12.Destination pd = p.to(" "); // !!

        Contents pc1 = p.con(); // ?
        System.out.println(pc1.i);
    }
}

/*
* 练习1
*
* public class Outer{
*   class Inner{
*
*   }
*   public Inner to(){
*       return new Inner();
*   }
*
* }
*
*
*
*
* */