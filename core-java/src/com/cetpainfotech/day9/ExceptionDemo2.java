package com.cetpainfotech.day9;

import java.util.Scanner;

import com.cetpainfotech.day8.assesment.Employee;
// try , catch , finally
public class ExceptionDemo2 {
	
	public static int div(int a, int b)
	{
		int c = 0;
		if(b<=0)
		{
			ArithmeticException ae = new ArithmeticException();
			throw ae;
		}
		c= a / b; // 
		
		return c;
	}

	public static void main(String[] args) {
		
		
		
		//int arr[] = {1,3,5};
		
		//System.out.println(arr[3]);
		
	//String str= "123ae";
	
	//int x = Integer.parseInt(str);
	//Employee emp =null;	
	
	//System.out.println(emp.getName());
		
		Scanner sc = new Scanner(System.in);
		//sc.close();
	//	int x = sc.nextInt();
		
		// AE , AIOBE, NFE, INME,NPE,ISE
		
		
		// ClassNotFoundException -CE
		
		
		// IOException , FileNotFoundException
		
		
int x = sc.nextInt();
int y = sc.nextInt();
int z  = 0;

try
{
 z =   div(x,y);
}catch (ArithmeticException e) {
	System.out.println("Devide by zero error");
}
System.out.println("End");
System.out.println(z); // AE
	




	}

}
