import java.io.*;
/**
 * Ѱ����(ͨ������) 18.12.1
 * 
*/
public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(".","X.file")));
        Object mystery = in.readObject();
        System.out.println(mystery.getClass());

    }
}