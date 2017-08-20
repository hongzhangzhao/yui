package IO.IO18dot7;

import java.util.*;
import java.io.*;

/**
 *
 */
public class TextFile extends ArrayList<String> {

    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader in = new BufferedReader(new FileReader((new File(fileName)).getAbsoluteFile()));

            String s;
            try {
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException var8) {
            throw new RuntimeException(var8);
        }

        return sb.toString();
    }

    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter((new File(fileName)).getAbsoluteFile());

            try {
                out.print(text);
            } finally {
                out.close();
            }

        } catch (IOException var7) {
            throw new RuntimeException(var7);
        }
    }

    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        if (((String) this.get(0)).equals("")) {
            this.remove(0);
        }

    }

    public TextFile(String fileName) {
        this(fileName, "\n");
    }

    public void write(String fileName) {
        try {
            PrintWriter out = new PrintWriter((new File(fileName)).getAbsoluteFile());

            try {
                Iterator var4 = this.iterator();

                while (var4.hasNext()) {
                    String item = (String) var4.next();
                    out.println(item);
                }
            } finally {
                out.close();
            }

        } catch (IOException var9) {
            throw new RuntimeException(var9);
        }
    }

    public static void main(String[] args) {
        String file = read("TextFile.java");
        write("test.txt", file);
        TextFile text = new TextFile("test.txt");
        text.write("test2.txt");
        TreeSet<String> words = new TreeSet(new TextFile("TextFile.java", "\\W+"));
        System.out.println(words.headSet("a"));
    }
}
