package com.MyJavaBase.FlowIO.IO18dot6;
import java.io.*;
public class BufferedInputFileBook {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s = null;
        StringBuilder sb = new StringBuilder();
        while( (s = in.readLine()) != null ){
                sb.append(s).append("\n");
        }
        in.close();
        return sb.toString();
    }

}
