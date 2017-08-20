package com.MyJavaBase.FlowIO.IO18dot6;
import java.io.*;
/**
 * 格式化的内存输入
 *
 *
 * */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try{
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFileBook.read("FormattedMemoryInput.java").getBytes()));
            while(true){
                System.out.print((char)in.readByte());//读到末尾会发生异常
            }

        }catch(EOFException e){
            System.out.println("End of Stream");
        }
    }
}
