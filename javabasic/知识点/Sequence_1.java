/*
 * ���ӵ��ⲿ��
 * ���������ģʽ
 * �ڲ�������������ⲿ������з���Ȩ�ޣ�-
 *     ��ͨ������󴴽�һ���ڶ����ڶ���Ჶ׽һ��ָ���ⲿ��Ķ�������ã�
 *     Ҳ����˵���ڲ��������Ҫ�ⲿ���������������̬�ڲ���Ͳ��á�
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

    private class SequenceSelector implements Selector { //˽���ڲ���
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
