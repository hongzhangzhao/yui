package Generics;

/**
 *
 * 15.10 通配符
 *
 */

class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple(); //ok
        fruit[1] = new Jonathan();//ok
        try{
            fruit[0] = new Fruit(); //父类型不能向下转成子类型
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            fruit[0] = new Orange();   //苹果类
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
