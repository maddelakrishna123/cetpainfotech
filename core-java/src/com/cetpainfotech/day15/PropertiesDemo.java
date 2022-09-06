package com.cetpainfotech.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Properties props = new Properties();
		
		props.put("Sal", "10101");
		props.setProperty("empName", "krishna");
		
		
		props.store(new FileOutputStream(new File("D:\\personal\\11am-sessions\\dbconfig.properties"),true), "New Props addes");
		
		props.load(new FileInputStream(new File("D:\\personal\\11am-sessions\\dbconfig.properties")));
		System.out.println(props);
		
		

	}

}
