package com.cetpainfotech.day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(35);
		list1.add(36);
		
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(20);
		intList.add(15);
		intList.add(23);
		intList.add(20);
		intList.add(25);
		intList.add(27);
		
		intList.addAll(list1);
		//System.out.println(intList.contains(150));
		
		System.out.println(intList);
		
		
/*	Object[] objs =	intList.toArray();
	
	for(Object o:objs)
	{
		Integer i = (Integer) o;
		
		System.out.println(i);
	}
		
	*/
		
	/*Integer[] ints = new Integer[intList.size()];	
		intList.toArray(ints);
		
		
		for(Integer i:ints)
		{
			System.out.println(i);
		}
		
		
	*/	
		/*Set<Integer> intSet = new HashSet<Integer>();
		
		
		intSet.add(20);
		intSet.add(15);
		intSet.add(23);
		intSet.add(20);
		intSet.add(25);
		
		System.out.println(intList);
		
		System.out.println("**************************************");
		
		System.out.println(intSet);
		
		
		*/
		
	
	  

	}

}
