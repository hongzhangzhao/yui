package Holding;
import java.util.*;
/**
 * 11.11
 */
public class QueueDemo {
    public static void printQ(Queue q){
        while(q.peek() != null){
            System.out.print(q.remove()+ " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Random r = new Random(47);
        for(int i=0;i<10;i++){
            q.offer(r.nextInt(i + 10));
        }

    }

}
