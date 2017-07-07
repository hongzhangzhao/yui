/*
 * 1,
 *
 */
import java.util.*;
class Yui {
    int i;
    public Yui(int i){
        this.i = i;
    }
}
public class Iu {
    private static Random ran = new Random(47);
    private String id;
    public Iu(String id){
        this.id = id;
    }
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    private final int i4 = ran.nextInt(20);
    private static final int INT_5 = ran.nextInt(20);

    private Yui y1 = new Yui(11);
    private final Yui y2 = new Yui(22);
    private static final Yui VAL_3 = new Yui(33);

    private final int[] a = {1,2,3,4,5,6};
    public String toString(){
        return "";
    }
    public static void main(String[] args){
        Iu iu1 = new Iu("fd1");
        //iu1.valueOne++;
        iu1.y2.i++;//final对象的数据是可以修改的，不能重新指向被的对象
        for(int i=0;i<iu1.a.length;i++){
            iu1.a[i]++;  //final数组里面的元素可以改变
        }


    }
}





