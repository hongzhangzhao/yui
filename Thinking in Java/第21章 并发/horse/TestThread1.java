

/**
 * �߳��ǳ����в�ͬ��ִ��·��
 * ������һ����̬�ĸ���
 * ���̼��ص��ڴ��У�׼����������
 * ������ִ�г�������߳�
 * main()�����߳�
 * �������ú��߳�����������
 * ���̵߳Ĳ�������ʵ������cpu��ʱ��Ƭ���䣬
 * Ҳ����˵��ĳһʱ��ֻ��һ���߳���ִ�У�
 * �����߳̽��ȴ���ִ��
 * �����߳�����Ҫ�����ַ�ʽ1ʵ��Runnable,2�̳�Thread:
 * ����ѡ��Runnable,�ô����Լ̳�������
 * 
*/

public class TestThread1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        //r.run();  //ֱ�ӵ���run()ֻ�ǵ����ķ������ã�

        
        Thread t = new Thread(r);
        t.start();   //ֻ�е���start()������������һ���߳�

        /*
            �����for����start()����?��Ȼ�����߳���α���У�
            ���ǲ�Ҫ���ǳ����ǰ�˳��ִ�еģ����forû��ִ����
            ��ִ�в���start()�ģ�����Ҳ�Ͳ��ῴ�������߳̽���
            �����Ч����
        
        */
        for(int i=0; i<100; i++){  
            System.out.println("Main Thread : ------" + i);
        }
    }
}

class Runner1 implements Runnable { //�����̵߳ķ�ʽ֮һ
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Runner1 :" + i);
        }
    }
}