import java.util.*;

public class Test {

    public static void main(String[] args) {

        String s1 = "987654321";

        /*
        这个方法是把字符串中的没个元素提取出来，
        并把每个元素转成char,
        再把没个转成char的元素按顺序存到一个char类型的数组中。
        */
        char[] ca = s1.toCharArray();
		
		String s2 = Arrays.toString(ca);//把数组中的元素转换成String==[,,,,]
		
		for(char c1:ca) {   //遍历ca数组中的每个元素，并把每个元素赋给c1

            System.out.print(c1);  //打印ca数组中的每个元素

        }
		
		Arrays.sort(ca); //可以给数组中的元素进行从小到大的排序
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		for (String s1 : list) { //输出集合中每个元素

			System.out.println(s1);
		}
		Object[] obj = list.toArray(); //将集合转换成数组

		for (Object x : obj) {		
			System.out.println(x.toString());

		}
		
		int[][] arr={{1,2},{3,4}};
		
		for(int[] x : arr){
			for(int y : x){
				
				System.out.println(y);
				
			}
			
		}
    }



}