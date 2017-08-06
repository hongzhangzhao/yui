package Arrays;


/*
 * 16.4
 * 
 * */
import java.util.*;

public class RaggedArray {
	public static void main(String[] args) {
		Random rand = new Random(47);
		System.out.println(rand.nextInt(7));
		
		int[][][] a = new int[rand.nextInt(7)][][];
		
		for(int i=0;i<a.length;i++){
			a[i] = new int[rand.nextInt(5)][];
			for(int j=0;j<a[i].length;j++){
				a[i][j] = new int[rand.nextInt(5)];
			}
		}
		System.out.println(Arrays.deepToString(a));
		
		int[][][] b = new int[3][3][4];
		System.out.println(b.length);
	}
}
