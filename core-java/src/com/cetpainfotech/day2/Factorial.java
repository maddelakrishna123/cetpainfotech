package com.cetpainfotech.day2;
/**
 * 
 * @author madde
 *
 */
public class Factorial {
	
	/** Calculates the factorial of given integer
	 * 
	 * @param num is any integer 
	 * @return  the factorial of num
	 */
public  static int  factorial(int num) // static method
{
	
	int fact = 1;
	
	for(int i =1; i<=num; i++)
	{
		fact*=i;
	}
	
	
	return fact;
}



public  void display()
{
	isEven(34);
}
public boolean isEven(int num) // instance method
{
	
	
	if(num%2==0)
		return true;
	
	return false;
}


public static void changeArray(int[] arr)
{
	for(int i =0;i<arr.length;i++)
	{
		arr[i]++;
	}
}


}

// sum(), getNumebr() , getInputStream()
// write method which should take one integer as argument and should return factorail of that integer

// method should return at most one value


// define a method isEven which take any integer and retur true if even false if odd
