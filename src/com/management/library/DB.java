package com.management.library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB 
{
	public static Connection getConnection()
	{	
		Connection con = null ;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false","root","admin123");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;
		
	}
}
