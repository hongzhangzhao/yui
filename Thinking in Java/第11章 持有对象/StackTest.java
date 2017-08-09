package Holding;

/**
 * 11.8
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> sta = new Stack<>();
        sta.push("1");
        sta.push("2");
        while(!sta.empty()){
            System.out.println(sta.pop());
        }

    }
}
