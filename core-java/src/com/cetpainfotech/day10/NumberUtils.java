package com.cetpainfotech.day10;

public class NumberUtils {
	
	
	public static String convertToHexaDecimal(int number)
	{
	
		
		
		
		return Integer.toHexString(number);
	}

	
	
	public static int convertToIntFromHexString(String str)  // 7b
	{
		
		int sum = 0;
		
		for(int i = str.length()-1; i>=0; i--)
		{
		char  c =	str.charAt(i);
		
		
	if( Character.isDigit(c))
	{
		int  x =Integer.parseInt(Character.valueOf(c).toString());
		
		System.out.println(x*Math.pow(16, i));
	}
		
	else if(Character.isLetter(c))
	{
		System.out.println(c+" is leter");
		
		switch (Character.toUpperCase(c)) {
		case 'A':
			
			System.out.println(10 * Math.pow(16, i));
			break;
			
	case 'B':
		System.out.println(11 * Math.pow(16, i));
			break;
	case 'C':
		System.out.println(12 * Math.pow(16, i));
		break;
	case 'D':
		System.out.println(13 * Math.pow(16, i));
		break;
	case 'E':
		System.out.println(14 * Math.pow(16, i));
		break;
		
		
	case 'F':
		System.out.println(15 * Math.pow(16, i));
		break;

		default:
			break;
		}
	}
	else
	{
		System.out.println(c+" is special symbol");
	}
		
		}
		return  0;
	}
	
	
	
	
	
}
