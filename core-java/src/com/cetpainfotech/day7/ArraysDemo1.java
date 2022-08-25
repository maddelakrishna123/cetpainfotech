package com.cetpainfotech.day7;

import java.util.Arrays;
import java.util.Scanner;

import com.cetpainfotech.day4.Employee;

/**
 * 
 * @author madde
 * 
 * 
 * 
 *    Array -> group of similar data elements 
 *    
 *    
 *     Why Array : 
 *     
 *     1)  to handle code complexity
 *     2) to improve the Performance 
 *     
 *     
 *     length or size : no of elements stored in the array
 *     
 *     position numbers or index is an integer value used to access the array elements
 *     
 *     index always starts from zero  and ends at size-1 
 *     
 *     length property give the no of elements stored in the array
 *     
 *     index boundary = 0 to (length-1)  0-4
 *     x[0] = 90
 *     x[1] = 80
 *     x[2] = 70
 *     x[3] = 89
 *     x[4] = 23
 *     x[5] = ArrayIndexOutOfBoundsException
 *     
 *     In java Arrays are secondary types
 *
 */
public class ArraysDemo1 {

	public static void main(String[] args) {
	
		
		
	int x[]= {90,80,70,89,23,56};
	
	Arrays.sort(x);
	
	// advanced for loop (for each loop)
	
	for(int a:x)
	{
		if(a%2!=0)
		System.out.println(a);
	}
	
	System.out.println("******************************************");
	
	
	
	/*for(int i = 0;i<x.length;i++)  // 
	{
	System.out.println(x[i]);
	}
*/
	
	
// control variable initialization 	
	
	// condition will be evaluated
	
	// executes the body : 
	
	// repeats till condition becomes false
	
	
	
	int key = 89;
	
	
	
	for(int i=0; i<x.length; i++)
	{
		
		if(x[i] == key)
		{
			System.out.println(key +" found in the array at position "+(i+1));
		}
	}
		
		

	}
	
	
	

}
