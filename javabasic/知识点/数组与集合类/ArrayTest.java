import java.util.Arrays;

/*
 *  
 * 
 * 
 * 
 * */

public class ArrayTest {

	public static void change(String[] s){
		
		String[] ss = s;
		ss[0]="wampire";
	
		
	}
	
	public static void main(String[] args){
		String[] a = {"1","2","3"};
		change(a);
		for(String s : a){
			System.out.println(s);
		}
		String[] b = new String[]{"1","2","3"};
		
		//比较两个数组中的元素是否相同
		boolean bl = Arrays.equals(a,b);
		System.out.println(bl);
	}
	
}