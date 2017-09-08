import java.util.concurrent.*;
import java.util.*;
/**
 * ���˯������ֹ���߳�̫�ֱ���
 * ���ñ�־λ�������ж��̣߳�
 * run()����һ�������߳̾ͽ�����
 * 
 * 
 * 
*/
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        //���ĸ��߳��������sleep()�����������ĸ��߳�˯��:
        try{ Thread.sleep(10000); } //main()�߳�˯���ˣ�
        catch(InterruptedException e){ }
        //��˯�ŵ�ʱ�����ϣ��൱��һ����ˮ����ȥ��
        thread.interrupt();//����:�����߳��׳��쳣����ִ�н�����
        
    }
}

class MyThread extends Thread {
    //�ڶ��ִ����ѭ���İ취�����ñ�־λ�������ı������ֵ�ͻ���ֹ��ѭ����
    boolean flag = true; 
    public void run(){
        while(flag){
            System.out.println("===" + new Date() + "===");
            try{
                sleep(1000);
            }catch(InterruptedException e){
                return; //����interrupt()�����ͻ�ִ����仰��
            }
        }
    }
}

/*
class MyThread extends Thread {
    public void run(){
        while(true){
            System.out.println("===" + new Date() + "===");
            try{
                sleep(1000);
            }catch(InterruptedException e){
                return; //����interrupt()�����ͻ�ִ����仰��
            }
        }
    }
}

*/