package com.MyJavaBase.FlowIO.IO18dot6;
import java.io.*;

public class FileOutputShortcut {
    static String file = "FileOutputShortcut.out";

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFileBook.read("FileOutputShortcut.java")));

        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;

        while((s = in.readLine()) != null ){
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFileBook.read(file));
    }

}
