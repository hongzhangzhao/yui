package Holding;
import java.util.*;
/**
 *
 * 11.11.1
 *
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Random r = new Random(47);
        for(int i=0;i<10;i++){
            pq.offer(r.nextInt(i + 10));  //通过offer添加元素，自然排序

        }
        QueueDemo.printQ(pq);

        List<Integer> list = Arrays.asList(23,76,13,56,1,13,44,3,5,7);
        pq = new PriorityQueue<Integer>(list);  //通过构造方法添加元素，自然排序
        QueueDemo.printQ(pq);

        pq = new PriorityQueue<Integer>(Collections.reverseOrder()); //构造方法中传递Comparator，改变排序规则
        pq.addAll(list);  //通过AddAll添加一组元素，自然排序

        QueueDemo.printQ(pq);

        String fact = "dsdg ce gf sdff etjuy";
        List<String> list1 = Arrays.asList(fact.split(""));

        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        pq1.addAll(list1);

        QueueDemo.printQ(pq1);

        pq1 = new PriorityQueue<String>(Collections.reverseOrder());
        pq1.addAll(list1);
        QueueDemo.printQ(pq1);

        Set<Character> charSet = new HashSet<>();
        for(char c : fact.toCharArray()){
            charSet.add(c);
        }
        PriorityQueue pq2 = new PriorityQueue(charSet);
        QueueDemo.printQ(pq2);



    }


}
