package com.courier_system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeliveryDao {
	
	
	

	public void addPickupData(String pFname, String pLname, long pmobile, String pEmail, String pHouseNo, String pStreet,
			                        String pLandmark, String pCity, int picupPinCode, Connection con) {
		// TODO Auto-generated method stub
		
		
try {
PreparedStatement pst =con.prepareStatement("insert into pcustomer(fname,lname,mobile,email,houseno,street,landmark,city,pincode) values(?,?,?,?,?,?,?,?,?)");
			
			pst.setString(1, pFname);
			pst.setString(2, pLname);
			pst.setLong(3, pmobile);
			pst.setString(4, pEmail);
			pst.setString(5, pHouseNo);
			pst.setString(6, pStreet);
			pst.setString(7, pLandmark);
			pst.setString(8, pCity);
			pst.setInt(9, picupPinCode);
			
		int i=	pst.executeUpdate();
		
		if(i>0) {
			System.out.println("you have successfully inserted record");
		}
		else {
			System.out.println("error in data insertion");
		}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
