package Arrays;
/*
 * 16.4
 * 
 * */
import java.util.*;

public class MultidimensionalObjectArrays {
	public static void main(String[] args) {
		//�ڶ�ά���������е�Ԫ�ظ�����ͬ
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
