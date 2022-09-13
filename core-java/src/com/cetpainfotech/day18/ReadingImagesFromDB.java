package com.cetpainfotech.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cetpainfotech.day17.DBConnection;

public class ReadingImagesFromDB {
	
	public static void main(String[] args) throws SQLException, IOException {
		
		String query = "select * from images where id =1010";
		
		Connection con = DBConnection.getConn();
		Statement st = con.createStatement();
		
	ResultSet rs=	st.executeQuery(query);
	
	if(rs.next())
	{
		FileOutputStream  os = new FileOutputStream(new File(rs.getString(3)));
	
	
	os.write(rs.getBytes(2));
	
	os.flush();
	os.close();
	
	}
	}

}
