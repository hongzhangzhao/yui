
/**
 * synchronized(this)
 * 执行代码的过程中锁定了当前对象，
 * 只有代码执行完了并释放了锁，其他
 * 线程才能使用这个对象；
 * 
*/

public class TestSync implements Runnable {
    Timer timer = new Timer();
    public static void main(String[] args) {
        TestSync test = new TestSync();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        //区别于直接继承Thread调用supper(String Name) 自定义线程名字
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

    //简单写法，直接写在方法签名上
    public  synchronized void add(String name ){
        //锁定当前对象,意思是只有一个线程可以访问当前对象的资源；
        //执行当前方法过程，锁定当前对象；
        //synchronized (this) {

        /*
            两个线程同时访问共享资源num,
            当第一个线程访问到num++,睡一秒，
            之后第二线程访问num++(此时num是1)，睡一秒(num是2了)
            两个线程都唤醒执行下面的打印num，将都是2(不希望的效果)；
            解决办法看上面；

        */
        num++;
        try{
            Thread.sleep(1);
        }catch(InterruptedException e){

        }
        System.out.println(name + ", 你是第" + num + "个使用timer的线程");
    }
   
//}
}
