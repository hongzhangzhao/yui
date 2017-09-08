public class TestJoin {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("t1");
        t1.start();
        try{ 
            //把t1和main合并到一起了，相当于方法调用，调用了run()方法；
            //t1执行完了，才执行main:
            t1.join(); 
        }catch (InterruptedException e){

         }
        

        for(int i=1; i<=10; i++){
            System.out.println("i am main thread");
        }
    }
}

class MyThread2 extends Thread {
    MyThread2(String s) { 
        super(s); //自动以线程名字
    }
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("i am " + getName());
            try{ 
                sleep(1000);
             }catch(InterruptedException e) { 
                return; 
            } 
            
        }
    }
}