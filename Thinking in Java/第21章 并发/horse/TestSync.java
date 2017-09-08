
/**
 * synchronized(this)
 * ִ�д���Ĺ����������˵�ǰ����
 * ֻ�д���ִ�����˲��ͷ�����������
 * �̲߳���ʹ���������
 * 
*/

public class TestSync implements Runnable {
    Timer timer = new Timer();
    public static void main(String[] args) {
        TestSync test = new TestSync();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        //������ֱ�Ӽ̳�Thread����supper(String Name) �Զ����߳�����
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

    public void run(){
        timer.add(Thread.currentThread().getName());
    }
}

class Timer {
    private static int num = 0;

    //��д����ֱ��д�ڷ���ǩ����
    public  synchronized void add(String name ){
        //������ǰ����,��˼��ֻ��һ���߳̿��Է��ʵ�ǰ�������Դ��
        //ִ�е�ǰ�������̣�������ǰ����
        //synchronized (this) {

        /*
            �����߳�ͬʱ���ʹ�����Դnum,
            ����һ���̷߳��ʵ�num++,˯һ�룬
            ֮��ڶ��̷߳���num++(��ʱnum��1)��˯һ��(num��2��)
            �����̶߳�����ִ������Ĵ�ӡnum��������2(��ϣ����Ч��)��
            ����취�����棻

        */
        num++;
        try{
            Thread.sleep(1);
        }catch(InterruptedException e){

        }
        System.out.println(name + ", ���ǵ�" + num + "��ʹ��timer���߳�");
    }
   
//}
}
