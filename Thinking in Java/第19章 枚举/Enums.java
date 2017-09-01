package Enumerated;

/**
 * Created by Kris on 2017/8/28.
 *
 */
import java.util.*;

public class Enums {
    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }


   public static <T> T random(T[] values){
       return values[rand.nextInt(values.length)];
   }

}
