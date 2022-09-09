package com.cetpainfotech.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
	
	
	
	public static List<Integer> evenList(List<Integer> list)
	{
		
		
		return list.stream().filter(t->t%2==0).collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
	
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(19);
		list.add(7);
		list.add(15);
		list.add(14);
		list.add(20);
		list.add(21);
		list.add(24);
		list.add(33);
		list.add(15);
		list.add(18);
		
		System.out.println(evenList(list));
		
		
//Stream<Integer> stream =		list.stream();
		
//Stream<Integer> evenStream =	stream.filter(t->t%2==0);
  List<Integer> evenList =  list.stream().filter(t-> t %2==0).collect(Collectors.toList());
  
  
  evenList.stream().forEach(t->System.out.println(t));
  //System.out.println(evenList);
		//boolean status = list.stream().allMatch(t->t%2==0);
		
	//Stream<Integer> stream =	list.stream();
	//boolean status =stream.allMatch((t)->t%2==0);
	
	//System.out.println(status);
	
	// terminal methods 
	
	// intermediate methods

	}

}
