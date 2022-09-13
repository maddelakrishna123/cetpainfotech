package com.cetpainfotech.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.cetpainfotech.day17.DBConnection;

public class WorkingWithDateandImage {

	public static void main(String[] args) throws SQLException, FileNotFoundException {
		
		
		
		
		String query ="insert into images values(?,?,?,?)";
		
		Connection con = DBConnection.getConn();
		
		PreparedStatement ps  = con.prepareStatement(query);
		
		
		ps.setInt(1, 1010);
		File file = new File("D:\\flowers.jpg");
		FileInputStream is = new FileInputStream(file);
		ps.setBinaryStream(2,is);
		
		ps.setString(3, file.getName());
		
		ps.setDate(4, new java.sql.Date(new Date().getTime()));
		
	int res =	ps.executeUpdate();
	
	if(res>=1)
	{
		System.out.println("Image Inserted");
	}

	}

}
