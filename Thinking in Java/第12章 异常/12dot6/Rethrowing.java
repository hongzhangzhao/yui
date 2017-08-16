package YiChang;

/**
 * 12.6.2
 */


public class Rethrowing {

    public static void f() throws Exception {
        throw new Exception("throw from f()");
    }

    public static void h() throws Exception {
        try{
            f();
        }catch(Exception e){
            throw (Exception)e.fillInStackTrace();
        }
    }
    public static void g() throws Exception {
        try{
            f();
        }catch(Exception e){
            e.printStackTrace(System.out);
            throw e;
        }
    }
}
