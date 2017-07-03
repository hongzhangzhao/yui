package com.basic;

import java.util.*;
/*
 * - 添加一组元素
 * - Arrays.asList() 可变参数列表 ,返回的List底层是数组，不能添加和删除元素
 * - Collections.addAll(Collection,......) 首选，可变参数列表
 * - Collection(Collection ction) 
 * - Collection.addAll(Collection ction)
 * 
 * 
 * */
class hongz {}

public class SimpleCollection {
	
	
	public static void main(String[] args){
		Collection ct = new ArrayList(Arrays.asList(1,2,3,4,5));
		System.out.println(ct.size());
		
		Integer[] moreInts = {6,7,8,9,10};
		Collection cct = new ArrayList(Arrays.asList(1,2,2));
		ct.addAll(cct);
		ct.addAll(Arrays.asList(moreInts));//只能传Collection对象
		ct.add(100);
		System.out.println(ct.size());
		
		Collections.addAll(ct,11,12,13,14,15);
		Collections.addAll(ct,new hongz(),new hongz(),new hongz(),new hongz(),new hongz());
		Collections.addAll(ct, moreInts);
		System.out.println(ct.size());
		
		Collections.addAll(ct,moreInts);
		System.out.println(ct.size());
		
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1, 99);
		System.out.println(list.get(1));
		//list.add(21); error ?
		
	}
	
}