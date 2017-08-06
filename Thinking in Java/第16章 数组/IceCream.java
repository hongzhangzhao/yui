package Arrays;
/*
 * 16.3
 * 
 * ��FLAVORS�����е�Ԫ����䵽results������
 * 
 * */
import java.util.*;

public class IceCream {
	private static Random  rand = new Random(47);  
	//����һ���������飬�����Ԫ�ؿ��Ը��ģ�����FLAVORS��ָ���ܸı�:
	static final String[] FLAVORS = {"a","b","c","d","e","f","g"}; 
	
	//һ������String����ķ�����n����results�Ĵ�С��forѭ���Ĵ���
	public static String[] flavorSet(int n){
		//�жϲ����Ƿ����FLAVORS����ĳ���:
		if(n > FLAVORS.length){
			throw new IllegalArgumentException("set too big");
		}
		//����String���飬��С�ǲ��� n:
		String[] results = new String[n];
		//boolean���͵����飬��С��FLAVORS����Ĵ�С
		boolean[] picked = new boolean[FLAVORS.length];
		for(int i=0;i<n;i++){
			int t;
			do{	
				//������������С��Χ�ڵ���
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
