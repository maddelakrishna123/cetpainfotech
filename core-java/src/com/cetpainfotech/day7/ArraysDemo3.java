package com.cetpainfotech.day7;

import java.util.Scanner;

/*
 *   1(0,0) 2(0,1) 3 (0,2)
 *   3(1,0) 4(1,1) 5(1,2)
 *   6(2,0) 7(2,1) 8(2,2)
 * i = 0 - 2 
 * j= 0 -2
 * j 
 * 3 X 3
 * 
 */
public class ArraysDemo3 {
	public static void main(String[] args) {
		
		
		//int arr[][]= {{1,2,3},{3,4,5,8},{6,7,8}};
		
	     int arr[][] = new int[3][3];
		
		
	     Scanner sc =new Scanner(System.in);
	     
	     System.out.println("Enter values");
	     
	     for(int row =0; row<arr.length; row++)
		 {
			 
			  for(int col=0; col<arr[row].length;col++)
			  {
				  
				  arr[row][col]=sc.nextInt();
				  
			  }
			 
			 
		 }
	     
	     
	     
		 for(int row =0; row<arr.length; row++)
		 {
			 
			  for(int col=0; col<arr[row].length;col++)
			  {
				  System.out.print(arr[row][col]+" ");
			  }
			  System.out.println();
			 
		 }
	}

}
