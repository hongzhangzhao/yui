import java.nio.*;
/**
 * 获取基本类型(ByteBuffer中获取不同的基本类型值)
 * 
 * 
*/
public class GetData {
    private static final int BSIZE = 1024;
    public static void main(String[] args){
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        int i=0;
        while(i++ < bb.limit()){
            if(bb.get() != 0)
                System.out.println("nonzero");
       }
       System.out.println("ii = "+ i);
       bb.rewind();
       bb.asCharBuffer().put("Howdy");
       char c;
       while((c = bb.getChar()) != 0)
            System.out.print(c + " ");
       System.out.println();
       
       bb.rewind();

       bb.asShortBuffer().put((short)471142);//转型后的结果可能会被截取和改变
       System.out.println(bb.getShort());
       bb.rewind();

       bb.asIntBuffer().put(99471142);
       System.out.println(bb.getInt());
       bb.rewind();

       bb.asLongBuffer().put(99471142);
       System.out.println(bb.getLong());
       bb.rewind();

       bb.asFloatBuffer().put(99471142);
       System.out.println(bb.getFloat());
       bb.rewind();

       bb.asDoubleBuffer().put(99471142);
       System.out.println(bb.getDouble());
       bb.rewind();


       
       
    }
}