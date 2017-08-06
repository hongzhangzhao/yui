package Arrays;

/*
 * 
 * 16.6.3 
 * 从生成器中创建数组
 * 
 * */

import java.util.*;

public class TestGenerated {
	public static void main(String[] args) {
		Integer[] a = { 9, 8, 7, 6 };
		System.out.println(Arrays.toString(a));
		a = Generated.array(a, new CountingGenerator.Integer());
		System.out.println(Arrays.toString(a));
		Integer[] b = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
		System.out.println(Arrays.toString(b));
	}
}
