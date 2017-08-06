package Arrays;
import java.util.*;
/*
 * 16.1 数组和泛型容器的比较
 * 
 * 
 * */

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	public String toString(){
		return "Sphere" + id;
	}
}

public class ContainerComparison {
	public static void main(String[] args) {
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for(int i=0;i<5;i++){
			//定义了10个位置空间，这里只添加5个元素，另外5个空间会用null站位:
			spheres[i] = new BerylliumSphere();  
		}
		System.out.println(Arrays.toString(spheres));
		int[] a = new int[10];
		//基本类型的站位是默认值 0 ；
		for(int i=0;i<5;i++){
			a[i] = i;
		}
		System.out.println(Arrays.toString(a));
		
		List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
		for(int i=0;i<5;i++){
			sphereList.add(new BerylliumSphere());
		}
		System.out.println(sphereList);
		
		int[] integer = {1,2,3,4,5};
		System.out.println(Arrays.toString(integer));
		
		List<Integer> ls = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(ls);
	}
	
}
