package com.MyJavaBase.FlowIO.IO18dot6;

import java.io.*;

public class BufferedInputFile {

    public static String read(String filename) throws IOException {
        FileReader in = new FileReader(filename);
        int x = 0;
        StringBuilder sb = new StringBuilder();
        while ((x = in.read()) != -1){  // 返回值代表读取的字符的int表现形式
            char w = (char)x;
            sb.append(w);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("BufferedInputFile.java"));
    }
}
