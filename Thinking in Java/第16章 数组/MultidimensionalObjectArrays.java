package Arrays;
/*
 * 16.4
 * 
 * */
import java.util.*;

public class MultidimensionalObjectArrays {
	public static void main(String[] args) {
		//第二维数组所持有的元素个数不同
		BerylliumSphere[][] spheres = 
		{
				{new BerylliumSphere(),new BerylliumSphere()},
				
				{
					new BerylliumSphere(),new BerylliumSphere(),
					new BerylliumSphere(),new BerylliumSphere()
				},
				
				{
					new BerylliumSphere(),new BerylliumSphere(),
					new BerylliumSphere(),new BerylliumSphere(),
					new BerylliumSphere(),new BerylliumSphere()
				},
			
			
			
		};
		System.out.println(Arrays.deepToString(spheres));
	}
	
	
}
