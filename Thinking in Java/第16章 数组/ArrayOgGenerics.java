package Arrays;
import java.nio.charset.MalformedInputException;
/*
 * 16.5
 * 
 * */
import java.util.*;

public class ArrayOgGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		//声明一个引用,带泛型不能实例化
		List<String>[] ls;
		
		List[] la = new List[10];
		//可以通过一个无泛型的数组，转个型在赋给持有泛型的数组引用：
		ls = (List<String>[])la;  //checked warning
		
		ls[0] = new ArrayList<String>();
		//  type mismatch
		//ls[1] = new ArrayList<Integer>();
		
		//List<String>是Object的子类型
		Object[] obj = ls;
		
		//没有抱怨的编译和运行
		obj[1] = new ArrayList<Integer>();
		//通过一个无泛型的数组转型给带有泛型的数组实例化，带泛型的数组对象也属于Object类，所以可以赋给Object类型数组
		List<BerylliumSphere>[] sphere = (List<BerylliumSphere>[])new List[10];
		
		for(int i=0;i<sphere.length;i++){
			sphere[i] = new ArrayList<BerylliumSphere>();
		}
	}
}
