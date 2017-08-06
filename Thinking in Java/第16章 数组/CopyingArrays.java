package Arrays;
/*
 * 16.7.1
 * ¸´ÖÆÊý×é
 * 
 * */
import java.util.*;

public class CopyingArrays {
	public static void main(String[] args) {
		int[] i = new int[7];
		int[] j = new int[10];
		Arrays.fill(i,47);
		
		Arrays.fill(j, 99);
		//i = [47, 47, 47, 47, 47, 47, 47]
		System.out.println("i = "+ Arrays.toString(i));
		//j = [99, 99, 99, 99, 99, 99, 99, 99, 99, 99]
		System.out.println("j = "+ Arrays.toString(j));
		
		System.arraycopy(i,0,j,0,i.length);
		//j =[47, 47, 47, 47, 47, 47, 47, 99, 99, 99]
		System.out.println("j =" + Arrays.toString(j));
		
		int[] k = new int[5];
		Arrays.fill(k, 103);
		
		System.arraycopy(i, 0, k, 0, k.length);
		//k = [47, 47, 47, 47, 47]
		System.out.println("k = "+ Arrays.toString(k));
		Arrays.fill(k, 103);
		
		System.arraycopy(k,0,i,0,k.length);
		//i = [103, 103, 103, 103, 103, 47, 47]
		System.out.println("i = "+Arrays.toString(i));
		
		Integer[] u = new Integer[10];
		Integer[] v = new Integer[5];
		Arrays.fill(u, new Integer(47));
		Arrays.fill(v, new Integer(99));
		//u =[47, 47, 47, 47, 47, 47, 47, 47, 47, 47]
		System.out.println("u ="+ Arrays.toString(u));
		//v =[99, 99, 99, 99, 99]
		System.out.println("v ="+ Arrays.toString(v));
		
		System.arraycopy(v, 0, u, u.length/2, v.length);
		//u =[47, 47, 47, 47, 47, 99, 99, 99, 99, 99]
		System.out.println("u ="+Arrays.toString(u));
		
		
		
	}
}
