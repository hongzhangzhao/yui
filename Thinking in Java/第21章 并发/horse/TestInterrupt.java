import java.util.concurrent.*;
import java.util.*;
/**
 * 打断睡眠来终止子线程太粗暴；
 * 设置标志位变量来中断线程；
 * run()方法一结束，线程就结束；
 * 
 * 
 * 
*/
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        //在哪个线程里面调用sleep()方法，就让哪个线程睡眠:
        try{ Thread.sleep(10000); } //main()线程睡眠了；
        catch(InterruptedException e){ }
        //你睡着的时候将你打断，相当于一盆凉水泼上去；
        thread.interrupt();//作用:让子线程抛出异常，并执行结束；
        
    }
}

class MyThread extends Thread {
    //第二种打断死循环的办法是设置标志位变量，改变变量的值就会终止死循环；
    boolean flag = true; 
    public void run(){
        while(flag){
            System.out.println("===" + new Date() + "===");
            try{
                sleep(1000);
            }catch(InterruptedException e){
                return; //调用interrupt()方法就会执行这句话；
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
                return; //调用interrupt()方法就会执行这句话；
            }
        }
    }
}

*/