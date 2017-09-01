package DeepHolding;
import java.util.*;
/**
 * 17.2.3
 * 使用抽象类
 */


public class Countries {
    public static final String[][] DATA = {{"A", "a"}, {"B", "b"}, {"C", "c"}, {"D", "d"}, {"E", "e"}, {"F", "f"}, {"G", "g"},{"H","h"},{"I","i"},{"J","j"},{"K","k"},{"L","l"},{"M","m"},{"N","n"},{"O","o"},{"P","p"},{"Q","q"},{"R","r"},{"S","s"},{"T","t"},{"U","u"},{"V","v"},{"W","w"},{"X","x"},{"Y","y"},{"Z","z"}};

    private static class FlyweightMap extends AbstractMap<String,String> { // 1， 继承抽象Map

        private static class Entry implements Map.Entry<String,String>  {  // 2， 实现Map的内部接口Entry
            int index;
            Entry(int index) {
                this.index = index;
            }
            public boolean equals(Object o){
                return DATA[index][0].equals(o);
            }
            public String getKey(){ return DATA[index][0]; }
            public String getValue(){ return DATA[index][1]; }
            public String setValue(String value ) {
                throw new UnsupportedOperationException();
            }
            public int hashCode(){
                return DATA[index][0].hashCode();
            }
        }//Entry implents Map.Entry<>

        static class EntrySet extends AbstractSet<Map.Entry<String,String>>{ // 内部类继承抽象Set
            private int size;
            EntrySet(int size){
                if(size < 0){
                    this.size = 0;
                }
                else if(size > DATA.length){
                    this.size = DATA.length;
                }
                else{
                    this.size = size;
                }
            }
            public int size(){
                return size;
            }
            private class Iter implements Iterator<Map.Entry<String,String>>{  // Iter 实现迭代器
                private Entry entry = new Entry(-1);
                public boolean hasNext(){
                    return entry.index < size - 1;
                }
                public Map.Entry<String,String> next(){
                    entry.index++;
                    return entry;
                }
                public void remove(){
                    throw new UnsupportedOperationException();
                }

            }//Iter implements Iterator
            public Iterator<Map.Entry<String,String>> iterator(){
                return new Iter();
            }
        }//EntrySet
        private static Set<Map.Entry<String,String>> entries = new EntrySet(DATA.length);
        public Set<Map.Entry<String,String>> entrySet(){
            return entries;
        }
    } //FlyweighMap extends AbstractMap<>

    static Map<String,String> select(final int size){
        return new FlyweightMap(){
            public Set<Map.Entry<String,String>> entrySet(){
                return new EntrySet(size);
            }
        };
    }
    static Map<String,String> map = new FlyweightMap();
    public static Map<String,String>  capitals(){
        return map;
    }
    public static Map<String,String> capitals(int size){
        return select(size);
    }
    static List<String> names = new ArrayList<String>(map.keySet());
    public static List<String> names(){
        return names;
    }
    public static List<String> names (int size) {
        return new ArrayList<String>(select(size).keySet());
    }

    public static void main(String[] args) {
        System.out.println(capitals(10));
        System.out.println(names(10));
        System.out.println(new HashMap<String,String>(capitals(3)));
        System.out.println(new LinkedHashMap<String,String>(capitals(3)));
        System.out.println(new TreeMap<String,String>(capitals(3)));
        System.out.println(new Hashtable<String,String>(capitals(3)));
        System.out.println(new HashSet<String>(names(6)));
        System.out.println(new LinkedHashSet<String>(names(6)));
        System.out.println(new TreeSet<String>(names(6)));
        System.out.println(new ArrayList<String>(names(6)));
        System.out.println(new LinkedList<String>(names(6)));
        System.out.println(capitals().get("BRAZIL"));
    }

}