package Generic;

import java.util.*;

public class ByteSet {
	
	public static void main(String[] args) {
		Byte[] possibles = {1,2,3,4,5,6,7,8,9};
	Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possibles));
	
	for(byte by : mySet){
		System.out.println(by+ " ");
	}
	}
	
}
