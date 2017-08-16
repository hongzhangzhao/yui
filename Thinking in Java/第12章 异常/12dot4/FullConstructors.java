package YiChang;

/**
 * 12.4
 */

class MyException extends Exception{
    public MyException(){}
    public MyException(String s){
        super(s);
    }
}
public class FullConstructors {
    public void f() throws MyException {
        System.out.println("ok");
        throw new MyException("asdfasdfa");
    }

    public static void main(String[] args) {

        try{
            new FullConstructors().f();
        }catch(MyException e){
            e.printStackTrace(System.err);
        }
    }
}
