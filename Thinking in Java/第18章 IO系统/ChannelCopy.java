import java.nio.*;
import java.nio.channels.*;
import java.io.*;
/**
 * 
 * 18.10 �ļ�����(һ���ļ������ݸ��Ƶ���һ���ļ���)
 * 
 * 
*/
public class ChannelCopy {
    private static final int BSIZE = 1024;
    public static void main(String[] args) throws Exception {
        if(args.length != 2){
            System.out.println("arguments: sourcefile destfile");
            System.exit(1);
        }
        FileChannel in = new FileInputStream(args[0]).getChannel(),
        out = new FileOutputStream(args[1]).getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        while(in.read(buff) != -1){
            buff.flip();
            out.write(buff);
            buff.clear();
        }
        
    }
}