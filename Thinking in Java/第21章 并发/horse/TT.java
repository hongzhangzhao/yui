
/**
 * 面试题
 * 
 * 
*/

public class TT implements Runnable {
    int b = 100;

    //当有一个线程在执行m1()的同时，其他线程可以执行m2()吗
    //可以访问 m2()没有锁
    public synchronized void m1() throws Exception {
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b = " + b);
    }

    public void m2 () {
        System.out.println(b);
    }

    public void  run(){
        try{
            m1();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        TT tt = new TT();
        Thread t = new Thread(tt);
        t.start();

        Thread.sleep(1000);

        /*
            m2()看到的要是100的话说明m2没有执行:
            m1()把b改成1000了，但是m1()没有解锁，
            m2()看到的仍然是100;
        */
        tt.m2();
    }
}