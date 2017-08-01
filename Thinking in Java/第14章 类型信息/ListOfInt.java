package Generic;
import java.util.*;


public class ListOfInt {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<5;i++){
			list.add(i);
		}
		for(int i : list){
			System.out.println(i+ " ");
		}
	}
}
