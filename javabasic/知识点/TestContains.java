/*
	- 一个集合中是否包含某个元素，
		可以把其他数组传进来，判断是否包含其他集合的所有元素
	

*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Arrays;


public class TestContains{
	
public static void main(String[] args){
	
	TreeSet ts = new TreeSet();
	ArrayList al = new ArrayList();
	
	ts.add("2");
	ts.add("1");
	ts.add("3");
	
 
	al.add("2");
	al.add("1");
	al.add("3"); 
	
	
	System.out.println(ts);//把里面的元素进行了排序
	
	System.out.println(al);
	
	//判断是否包含某些元素
	System.out.println(ts.contains("2"));
	System.out.println(ts.containsAll(al));

	Iterator it = ts.iterator();
	
while(it.hasNext()){
	System.out.print(it.next());
	it.remove();
	
}
System.out.println(ts);
	
al.add(0,"xx");

System.out.println(al);

al.set(2,"yy");
	System.out.println(al);
	
	//把ArrayList转换成数组
String[] yy  = (String[])al.toArray(new String[0]);
	//System.out.println(Arrays.toString(yy));
}
}