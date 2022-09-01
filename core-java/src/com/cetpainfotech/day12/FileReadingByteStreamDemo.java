package com.cetpainfotech.day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReadingByteStreamDemo {
	
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\flowers.jpg");
		
		InputStream is = new FileInputStream(file);
		
		
              byte[] data  = new byte[is.available()];
              
            is.read(data);
              
             
          //    String str = new String(data);
              
          //    System.out.println(str);
		
	//	String str="Java Is Distributed";
		
		OutputStream os = new FileOutputStream(file.getName());
		
		os.write(data);
		
		os.flush();
		
	}

}
