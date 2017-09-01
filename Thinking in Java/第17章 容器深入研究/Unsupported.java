package DeepHolding;
import java.util.*;
/**
 *
 *
 *
 */
public class Unsupported {

    static void test(String msg , List<String> list){
        System.out.println("---"+msg+"---");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1,8);
        Collection<String> c2 = new ArrayList<String>(subList);

        try{
            c.retainAll(c2);
        }catch(Exception e){
            System.out.println("retainALl()" + e);
        }
        try{
            c.removeAll(c2);
        }catch(Exception e){
            System.out.println("removeAll()"+e);
        }
        try{
            c.clear();
        }catch(Exception e){
            System.out.println("clear()"+e);
        }
        try{
            c.add("x");
        }catch(Exception e){
            System.out.println("add()"+e);
        }
        try{
            c.addAll(c2);
        }
        catch(Exception e){
            System.out.println("addALl()"+e);
        }
        try{
            c.remove("c");
        }
            catch(Exception e){
                System.out.println("c.remove"+e);
            }
            try{
                list.set(0,"x");
            }
            catch(Exception e){
                System.out.println("list.set()"+e);
            }

    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A,B,C,D,E,F,G,H,I".split(","));
        test("modifiable copy",new ArrayList<String>(list));
        test("Arrays.asList()",list);
        test("unmodifiableList()",Collections.unmodifiableList(new ArrayList<String>(list)));
    }

}
