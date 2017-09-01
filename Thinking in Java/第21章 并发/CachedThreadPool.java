package Concurrency;
import java.util.concurrent.*;

/**
 * 21.2.3
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService  exec = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++)
            exec.execute(new LiftOff());

        exec.shutdown();
    }
}
