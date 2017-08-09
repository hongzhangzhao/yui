package Generics;

/**
 * 15.10.2
 *
 */
        import java.util.*;

public class GenericWriting {
    static <T> void writeExact(List<T> list , T item){
        list.add(item);
    }

}
