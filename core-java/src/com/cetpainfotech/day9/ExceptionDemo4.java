package com.cetpainfotech.day9;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		
		try
		{
			
		Integer.parseInt("abc");
			int a = 6;
			int b =2;
			int c = a/b;
			
			int arr[] = {1,2,4};
			System.out.println(arr[2]);
			
			String str = new String("aa");
			System.out.println(str.toCharArray());
			
		 }catch (Exception e) {
			
			 e.printStackTrace();
		}/*catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index not found");
		}catch (NullPointerException e) {
			
			System.out.println("Null Object");
		}*/
		
		System.out.println("End");
		
	}

}
