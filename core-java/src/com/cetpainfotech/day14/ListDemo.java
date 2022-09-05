package com.cetpainfotech.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		
		// adding object to list 
		
		// add(Object 0) addAll(Collection c)  - Collection
		
		// add(int index , Object o)   addAll(int index , Collecttion c)  - List interface
		
		
		
list.add(90);
list.add(9);
list.add(23);
list.add(34);
list.add(27);
list.add(14);
list.add(9);
list.add(102);


System.out.println(list);
	
	
List<Integer> list1 = new ArrayList<Integer>();

list1.add(56);
list1.add(67);
list1.add(9);
list1.add(78);

System.out.println(list1);

list.addAll(2,list1);
	


//list.add(2, 100);
	System.out.println(list);
	
	System.out.println(list.size());
	
	// removing
	
	//list.remove(new Integer(102));
	
	//list.retainAll(list1);
	
	
	//list.removeIf(t->t%2==0);
	
	
	
	
	//System.out.println("After Remove");
	
	// Updation of Elements 
	
	//list.set(list.lastIndexOf(9), 10);
	
	//list.clear();
	//Integer[] x = new Integer[list.size()];
	//list.toArray(x);
	
	System.out.println("********************************************");
	
	System.out.println(list);
	

	//Iterator<Integer> itr =	list.iterator();
	/*ListIterator<Integer> itr = list.listIterator(5);
	
	
	
  
	
	while(itr.hasPrevious())
	{
		     Integer i = itr.previous();
		     
		     System.out.println(i);
	}
	System.out.println(list);
	
	*/
	
	// searching 
	
	//list.remove(3);
	
	//System.out.println(list.containsAll(list1));
	
	
	// adding , removing, searching, modifying , iterating
	
	
	// Sorting
	
	}

}
