package IO.IO18dot8;
import java.io.*;
/**
 *
 */
public class ChangeSystemOut {
    public static void main(String[] args) throws IOException {

        PrintWriter out = new PrintWriter(System.out,true);

        out.println("Hello,World");

    }
}
