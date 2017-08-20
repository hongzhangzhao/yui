import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class GetChannel{
    private static final int BSIZE = 1024;
    public static void main (String[] args) throws Exception {
        FileChannel fc = new FileOutputStream("data.txt").getChannel();
        //wrap一个有数据的字节数组包装到缓冲器中
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();
        fc = new RandomAccessFile("data.txt","rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();
        fc = new FileInputStream("data.txt").getChannel();
        //allocate无数据可定义容量的字节数组包装进缓冲器
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.filp(); 
        while(buff.hasRemaining()){
            System.out.print((char)buff.get());

        }
    }


}
