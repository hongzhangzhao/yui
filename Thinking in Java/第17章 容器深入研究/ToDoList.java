package DeepHolding;
import java.util.*;
/**
 *
 *
 *
 *  */

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem> {
        private char primary;
        private int secondary;
        private String item;
        public ToDoItem (String td , char pri , int sec) {
            item = td ;
            secondary = sec;
            primary = pri;
        }
        public int compareTo(ToDoItem arg){
            if(primary > arg.primary)
                return +1;
            if(primary == arg.primary)
                if(secondary >  arg.secondary)
                    return +1;
                else if(secondary == arg.secondary)
                    return 0;
            return -1;

        }

        public String toString(){
            return "1";
        }
    }// ToDoTtem



}
