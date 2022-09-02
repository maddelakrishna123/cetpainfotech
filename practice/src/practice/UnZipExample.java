package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipExample {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("MyZip.zip"));
		
		ZipInputStream zip = new ZipInputStream(fis);
		ZipEntry entry = zip.getNextEntry();
		byte[] buffer = new byte[1024];
		while(entry!=null)
		{
			String filename = entry.getName();
			FileOutputStream fos = new FileOutputStream("D:\\"+filename);
			
			
			int length;
			while((length=zip.read(buffer))>0)
			{
				fos.write(buffer, 0, length);
			}
			
			fos.close();
			
			entry = zip.getNextEntry();
		}
		
		
		
	}

}
