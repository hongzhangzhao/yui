/**
 * Created by Kris on 2017/7/18.
 */

import java.util.*;

class QueueDemo{
    public static void printQ(Queue q){
        while(q.peek() != null){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Random rand = new Random(47);
        for(int i=0;i<10;i++){
            pq.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQ(pq); //

        List<Integer> list = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
        pq = new PriorityQueue(list);
        QueueDemo.printQ(pq); //

        pq = new PriorityQueue<Integer>(list.size(),Collections.reverseOrder());
        pq.addAll(list);
        QueueDemo.printQ(pq);//

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        QueueDemo.printQ(stringPQ);  //

        stringPQ = new PriorityQueue<String>(strings.size(),Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ); //

        Set<Character> set = new HashSet<>();
        for(char c : fact.toCharArray()){
            set.add(c);

        }
        PriorityQueue<Character> charPQ = new PriorityQueue<>(set);
        QueueDemo.printQ(charPQ); //

    }
}
/*0 1 1 1 1 1 3 5 8 14
  1 1 2 3 3 9 9 14 14 18 18 20 21 22 23 25 25
  25 25 23 22 21 20 18 18 14 14 9 9 3 3 2 1 1
      A A B C C C D D E E E F H H I I L N N O O O O S S S T T U U U W
  W U U U T T S S S O O O O N N L I I H H F E E E D D C C C B A A
  A B C D E F H I L N O S T U W
  */
