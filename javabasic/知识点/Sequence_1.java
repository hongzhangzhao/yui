/*
 * 连接到外部类
 * 迭代器设计模式
 * 内部类如何做到对外部类的所有访问权限：-
 *     当通过外对象创建一个内对象，内对象会捕捉一个指向外部类的对象的引用，
 *     也就是说，内部类对象需要外部类对象来构建，静态内部类就不用。
 *
 *
 */

interface Selector{
    boolean end();
    Object current();
    void next();
}


public class Sequence_1 {
    public void demo(){
        System.out.println("can");
    }

    private Object[] items;
    private int next = 0;

    public Sequence(int size){items = new Object[size];}

    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector { //私有内部类
        private int i = 0;

        public boolean end() {return i == items.length;}

        public Object current() {return items[i];}

        public void next() {
            if (i < items.length) i++;}

    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args){
        Sequence sq = new Sequence(10);
        for(int i=0;i<10;i++)
            sq.add(Integer.toString(i));

        Selector sl = sq.selector();
        while(!sl.end()){
            System.out.print(sl.current() + " ");
            sl.next();
        }

    }
}
