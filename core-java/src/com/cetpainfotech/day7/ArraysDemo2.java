package com.cetpainfotech.day7;

import java.util.Scanner;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		
		int[] x= new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Elements ");
		
		
		for(int i =0; i<x.length;i++)
		{
			x[i] = sc.nextInt();
		}
		
		
		System.out.println("The array elements are ");
		
		for(int a:x)
		{
			System.out.println(a);
		}

		
		
		
	}

}
