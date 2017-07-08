/*
   ~ Transmogrify
 * 状态模式？
 * 用继承表达行为间的差异，并用字段表达状态上的变化
 *
 * ~ is-a:纯粹的,子类中的结构和父类是一样的，
 * ~ is-like-a:像一个,子类在父类的基础上又添加了新的接口(方法)，
 * ~ 向上转型会丢失具体的类型信息，
 *
 * ~
 *
 */
/*
class Actor{
    public void act(){}
}

class HappyActor extends Actor {
    public void act(){
        System.out.println("HappyActor");
    }
}
class SadActor extends Actor{
    public void act(){
        System.out.println("SadActor");
    }
}

class Stage{
    private Actor actor = new HappyActor();
    public void change(){actor = new SadActor();}
    public void performPlay(){actor.act();}
}

public class Transmogrify{
    public static void main(String[] args){
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
*/

class Useful{
    public void f(){}
    public void g(){}
}
class MoreUseful extends Useful{
    public void f(){}
    public void g(){}
    public void u(){}
    public void v(){}
    public void m(){}
}
public class RTTI{
    public static void main(String[] args){
        Useful[] x = {new Useful(),new MoreUseful()};
        x[0].f();
        x[1].g();
        //((MoreUseful)x[0].u());//父类不能转成子类，也用不了子类中扩展的接口
        ((MoreUseful)x[1]).u();
    }
}