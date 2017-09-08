
/**
 * ������
 * 
 * �����߳̿����������û�м����ķ��������ܻ�Լ����ķ�������Ӱ�죻
 * 
 * 
*/

public class TTR implements Runnable {
    int b = 100;

    //����һ���߳���ִ��m1()��ͬʱ�������߳̿���ִ��m2()��
    //���Է��� m2()û����
    public synchronized void m1() throws Exception {
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b = " + b);
    }

    public synchronized void m2 ()  throws Exception {
        Thread.sleep(2500);
        b = 2000;
        //System.out.println(b);
    }

    public void  run(){
        try{
            m1();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        TTR tt = new TTR();
        Thread t = new Thread(tt);
        t.start();

       // Thread.sleep(1000);

        /*
            m2()������Ҫ��100�Ļ�˵��m2û��ִ��:
            m1()��b�ĳ�1000�ˣ�����m1()û�н�����
            m2()��������Ȼ��100;
        */
        tt.m2();

        System.out.println(tt.b);
    }
}