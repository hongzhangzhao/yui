package YiChang;

/**
 * 12.6.1
 */
public class WhoCalled {
    static void f(){
        try{
            throw new Exception();
        }catch(Exception e){
            for(StackTraceElement se : e.getStackTrace()){
                System.out.println(se.getMethodName());
            }
        }
    }
    public static void main(String[] args) {
        f();
    }
}
