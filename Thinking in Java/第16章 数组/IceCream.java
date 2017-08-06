package Arrays;
/*
 * 16.3
 * 
 * 把FLAVORS数组中的元素填充到results数组中
 * 
 * */
import java.util.*;

public class IceCream {
	private static Random  rand = new Random(47);  
	//定义一个常量数组，里面的元素可以更改，但是FLAVORS的指向不能改变:
	static final String[] FLAVORS = {"a","b","c","d","e","f","g"}; 
	
	//一个返回String数组的方法，n定义results的大小和for循环的次数
	public static String[] flavorSet(int n){
		//判断参数是否大于FLAVORS数组的长度:
		if(n > FLAVORS.length){
			throw new IllegalArgumentException("set too big");
		}
		//声明String数组，大小是参数 n:
		String[] results = new String[n];
		//boolean类型的数组，大小是FLAVORS数组的大小
		boolean[] picked = new boolean[FLAVORS.length];
		for(int i=0;i<n;i++){
			int t;
			do{	
				//随机产生数组大小范围内的数
				t = rand.nextInt(FLAVORS.length);
			}while(picked[t]);
			results[i] = FLAVORS[t];
			picked[t] =true;
		}
		return  results;
	}
	public static void main(String[] args) {
		for(int i=0;i<7;i++){
			System.out.println(Arrays.toString(flavorSet(3)));
		}
	}
}
