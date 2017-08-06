package Arrays;
import java.util.*;
/*
 * 16.4
 * 
 * 
 * */

public class AutoboxingArray {
	public static void main(String[] args) {
		Integer[][] a = {
				{1,2,3,4,5},
				{11,22,33,44,55},
				{111,222,333,444,555},
				{1111,2222,3333,4444,5555},
				
		};
		System.out.println(Arrays.deepToString(a));
		
		Integer[] b = new Integer[10];
		System.out.println(Arrays.toString(b));
	}
	
	
}
