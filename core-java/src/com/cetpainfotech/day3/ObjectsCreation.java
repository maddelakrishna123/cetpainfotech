package com.cetpainfotech.day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.cetpainfotech.day2.Employee;

public  class ObjectsCreation {
	
	

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException  {
		
		int id = 23;
		String name = "k";
		
		double sal = 234.4;
		
		Date d3 = new Date();
		
		System.out.println(d3);
		String d1 = "12-08-2010";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse(d1);
		Employee emp = new Employee(id, name, sal, date);
		
	

		

	}
	
	// 12-08-2010
	
}

// static - static variables - static methods  , static blocks


// is it possible to use static with class (inner classes)

        
