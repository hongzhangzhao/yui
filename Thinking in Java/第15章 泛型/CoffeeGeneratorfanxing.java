package Generics;

/**
 * 泛型接口  15.3
 * 生成器是工厂设计模式的一种应用
 * 接口和类，是自定义的一种变量类型，建立该变量以使用其中的功能
 *
 * 当使用foreach遍历对象，对象初始化完成之后，会调用Iterator所实现的对象，并执行其中的hasNext() and next();
 *
 * 第二个构造方法(末端哨兵)，使hasNext()返回false
 *
 */
import java.util.*;

interface Generator<T>{  //不需要额外信息就能创建对象，泛型应用在接口的一种方式(生成器)
    T next();
}

class Coffee{
    private static long counter = 0;   //
    private final long id = counter++; // 每当创建该类对象时，id都会递增，因为counter变量被所有对象共享
    public String toString(){
        return this.getClass().getSimpleName() + " " + id;
    }
}

class Latte extends Coffee{}
class Mocha extends Coffee{}
class Cappuccino extends Coffee{}
class Americano extends Coffee{}
class Breve extends Coffee{}

public class CoffeeGeneratorfanxing implements Generator<Coffee>,Iterable<Coffee>{  // ??
    private Class[] coffee = {
            Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class
    };
    private static Random rand = new Random(47);
    CoffeeGeneratorfanxing(){}

    private int size = 0;

    public CoffeeGeneratorfanxing(int size){
        this.size = size;
    }
    public Coffee next(){
        try {
            return (Coffee)coffee[rand.nextInt(coffee.length)].newInstance();//新建的对象是Object
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        public boolean hasNext(){
            return count > 0;
        }
        public Coffee next(){
            count--;
            return CoffeeGeneratorfanxing.this.next();
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }

    }
    public Iterator<Coffee> iterator(){
        return new CoffeeIterator();     // 对象初始化结束后，执行Iterator对象(初始化实现类)，调用其中方法
    }

    public static void main(String[] args) {
        CoffeeGeneratorfanxing gen = new CoffeeGeneratorfanxing();
        for(int i=0;i<5;i++){
            System.out.println(gen.next());
        }
        for(Coffee c : new CoffeeGeneratorfanxing(5))   //初始化结束回到这一步
            System.out.println(c);
    }

}
