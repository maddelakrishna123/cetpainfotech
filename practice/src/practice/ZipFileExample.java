package practice;

public class ZipFileExample {

	public static void main(String[] args) {
		
		
		
		

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
 