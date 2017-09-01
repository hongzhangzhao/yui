package Concurrency;
import java.util.concurrent.*;
/**
 21.2.4
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            exec.execute(new LiftOff());

        }
        exec.shutdown();
    }

}
