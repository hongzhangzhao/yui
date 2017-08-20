import java.nio.charset.*;
import java.util.*;
/**
 * 
 * 数据转换(编码转换)
 * 
*/
public class AvailableCharSets {
    public static void main(String[] args){
        SortedMap<String,Charset> charSets = Charset.availableCharsets();

        Iterator<String> it = charSets.keySet().iterator();
        while(it.hasNext()){
            String csName = it.next();
            System.out.print(csName);
            Iterator aliases = charSets.get(csName).aliases().iterator();
            if(aliases.hasNext()){ System.out.print(": ");}
            while(aliases.hasNext()){
                System.out.println(aliases.next());
                if(aliases.hasNext()){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}