package com.courier_system.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

private static Connection con=null;
	
	static {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/courierdb","root","");
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static Connection getCon()
	{
		return con;
		
	}

}
