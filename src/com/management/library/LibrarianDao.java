package com.management.library;
import java.sql.*;
public class LibrarianDao {



	
public static int delete(int id)
{	int status = 0;
	try
	{
		Connection con = DB.getConnection();
		PreparedStatement ps= con.prepareStatement("delete from librarian where id=?");
		ps.setInt(1, id);
		status=ps.executeUpdate();
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
	
}

public static boolean validate(String name, String pass)
{
	boolean status = false;
	try
	{
		Connection con =DB.getConnection();
		PreparedStatement ps= con.prepareStatement("select * from librarian where name = ? and pass=?");
		ps.setString(1, name);
		ps.setString(2, pass);
		ResultSet rs= ps.executeQuery();
		status= rs.next();
		con.close();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}



public static int save(String name, String email, String pass, String address,
		String contact) 
{
	int status =0;
	try
	{
		Connection con =DB.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into librarian(name, email, pass, address, contact) values (?,?,?,?,?) ");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, pass);
		ps.setString(4, address);
		ps.setString(5, contact);
		status = ps.executeUpdate();
		con.close();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	return status;

}




}
