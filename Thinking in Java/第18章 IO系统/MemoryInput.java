package com.MyJavaBase.FlowIO.IO18dot6;
import java.io.*;
/**
 *
 * 从内存输入
 *
 * */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFileBook.read("MemoryInput.java"));

        int c;
        while((c = in.read()) != -1){
            System.out.println((char)c);
        }
    }

}
