

/**
 * 线程是程序中不同的执行路径
 * 进程是一个静态的概念
 * 进程加载到内存中，准备就绪运行
 * 真正在执行程序的是线程
 * main()是主线程
 * 方法调用和线程启动的区别
 * 多线程的并行运行实际上是cpu的时间片分配，
 * 也就是说在某一时刻只有一个线程在执行，
 * 其他线程将等待被执行
 * 创建线程有主要有两种方式1实现Runnable,2继承Thread:
 * 优先选择Runnable,好处可以继承其它类
 * 
*/

public class TestThread1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        //r.run();  //直接调用run()只是单纯的方法调用；

        
        Thread t = new Thread(r);
        t.start();   //只有调用start()才真正的启动一个线程

        /*
            如果把for放在start()上面?虽然两条线程是伪并行，
            但是不要忘记程序是按顺序执行的，如果for没有执行完
            是执行不到start()的，所以也就不会看到两个线程交替
            输出的效果；
        
        */
        for(int i=0; i<100; i++){  
            System.out.println("Main Thread : ------" + i);
        }
    }
}

class Runner1 implements Runnable { //创建线程的方式之一
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Runner1 :" + i);
        }
    }
}