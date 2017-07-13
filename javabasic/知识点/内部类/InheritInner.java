/**
 * 继承内部类
 * 由于内部类对象会包含一个外部类的对象的引用，
 * 子类初始化必须也初始化外部类的对象引用，
 *
 * 子类初始化会首先初始化父类，父类的的初始化要通过外部类的对象去调用；
 *
 */

class WithInner{

    class Inner{}
} //

public class InheritInner extends WithInner.Inner{
    InheritInner(){
        new WithInner().super();  //外部类对象调用内部类构造器

    }
    InheritInner(WithInner w){  //通过传参的形式
        w.super();
    }

    public static void main(String[] args){
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);

    }

} //
