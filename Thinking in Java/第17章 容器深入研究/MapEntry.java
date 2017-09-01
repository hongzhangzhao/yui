package DeepHolding;
import java.util.*;
/**
 *
 *
 */
public class MapEntry<K,V> implements Map.Entry<K,V>{

    private K key;
    private V value;

    MapEntry(K key , V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
    public V setValue (V value) {
        V old = this.value;
        this.value = value;
        return old;
    }
    public int hasCode(){
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }
    public boolean equals (Object o) {
        if( !(o instanceof MapEntry)){
            return false;
        }
        MapEntry m = (MapEntry)o;
        return (key == null ? m.getKey() == null : key.equals(m.getKey())) &&
                (value == null ? m.getValue() == null : value.equals(m.getValue()));

    }
    public String toString(){
        return key + "=" + value;
    }


}
