package com.cetpainfotech.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cetpainfotech.day13.CollectionsDemo2;
import com.cetpainfotech.day13.Employee;

public class ListDemo1 {

	public static void main(String[] args) {
	
		
		
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(20);
		intList.add(12);
		intList.add(9);
		intList.add(23);
		intList.add(34);
		intList.add(2);
		
		List<String> str = new ArrayList<String>();
		
		str.add("Rahul");
		str.add("Nithin");
		
		str.add("Jatin");
		str.add("Kaushik");
		str.add("Ayush Gupta");
		
		List<Employee> empList = CollectionsDemo2.loadEmployees("D:\\emp.txt");
		
		
		System.out.println(intList);
		System.out.println(str);
		System.out.println(empList);
		
		System.out.println("After Sorting");
		
		Collections.sort(intList,new NumberComparator());
		Collections.sort(str,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			
				return -o1.compareTo(o2);
			}
		});
		
		
		Comparator<Employee> empComparator = (e1,e2)->{
			
			if(e1.getSalary() < e2.getSalary())
				return 1;
			else if(e1.getSalary() > e2.getSalary())
				return -1;
			else
				return 0;
		};
		
		
		System.out.println(intList);
		
		
		Collections.sort(empList,empComparator.reversed());
		System.out.println(str);
		System.out.println(empList);

	}

}
