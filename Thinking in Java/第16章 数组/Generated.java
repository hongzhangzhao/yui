package Arrays;
import java.util.*;

import net.mindview.util.CollectionData;
/*
 * 16.6.3
 * 
 * */
public class Generated {
	public static <T> T[] array(T[] a,Generator<T> gen){
		return new CollectionData<T>(gen,a.length).toArray(a);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] array(Class<T> type,Generator<T> gen,int size){
		T[] a = (T[])java.lang.reflect.Array.newInstance(type, size);
		return new CollectionData<T>(gen,size).toArray(a);
	}
}
