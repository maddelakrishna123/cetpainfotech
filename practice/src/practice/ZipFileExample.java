package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileExample {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = new FileOutputStream("MyZip.zip");
		
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		File fileToZip = new File("D:\\personal\\11am-sessions\\employeedetails.txt");
		FileInputStream fis = new FileInputStream(fileToZip);
		
		ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		
		zos.putNextEntry(zipEntry);
		byte[] data = new byte[1024];
		int length;
		while((length=fis.read(data))>=0)
		{
			zos.write(data);
		}
		
		zos.close();
		fos.close();
		fis.close();

	}

}



/*
 *  1. Create FileOutputStream
 *  
 *    FileOutPutStream fos = new FileOutPutStrean("myfoler.zip");
 *    
 *  2.Create ZipOutStream 
 *  
 *       ZipOutPutStream zipOutPut = new ZipOutPutSteam(fos);
 *       
 *       
 *  3. Create SourceFile Object
 *  
 *         File fileToZip = new File("abc.txt");
 *         
 *         
 *  4. Create FileInputStream
 *  
 *    FileInputStream fis = new FileInputStream(fis);
 *  
 *  5. Create ZipEntry 
 *  
 *  ZipEntry zipEntry  = new ZipEntry(fileToZip.getName);
 *  6. Put the Zip Entry into ZipOutputStream
 *  
 *  zipOutPut.putNextEntry(zipEntry);
 *  
 * 7 . Copy All byte from InputStrean to outputstream 
 * 
 * 
 *        int length ;  
        while( ( length = FiS.read( bytes ) ) >= 0 ) {  
            zipOut.write( bytes, 0, length ) ;  
        } 
        
         
     8. Close all Streams
        zipOut.close( ) ;  
        FiS.close( ) ;  
        FoS.close( ) ;  
 *  
 * 
 *  
 *  */
 