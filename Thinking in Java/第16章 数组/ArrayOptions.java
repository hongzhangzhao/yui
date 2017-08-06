package Arrays;

import java.util.*;

/*
 * 16.2
 * 
 * 
 * */
public class ArrayOptions {
	public static void main(String[] args) {
		BerylliumSphere[] a;
		BerylliumSphere[] b = new BerylliumSphere[5];
		
		BerylliumSphere[] c = new BerylliumSphere[4];
		for(int i=0;i<c.length;i++){
			if(c[i] == null){
				c[i] = new BerylliumSphere();
			}
		}
		
		BerylliumSphere[] d = {new BerylliumSphere()};
		
		int[] e;
		int[] f = new int[5];
		for(int i=0;i<f.length;i++){
			f[i] = i*i;
		}
		char[] ch = new char[1];
		System.out.println(Arrays.toString(ch));
	}
	
}
