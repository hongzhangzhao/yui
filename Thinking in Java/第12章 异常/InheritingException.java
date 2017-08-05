package YiChang;

/**
 * 12.4
 *
 */
class SimpleException extends Exception{}

public class InheritingException {
    public void f() throws SimpleException {
        System.out.println("aa");
        throw new SimpleException();
        //System.out.println("bb");   //error
    }
    public static void main(String[] args) {
        InheritingException i = new InheritingException();
        try{i.f();
        }catch(SimpleException e){

        }
    }

}
