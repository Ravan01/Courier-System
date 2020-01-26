package com.courier_system.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.courier_system.dao.ConnectionProvider;
import com.courier_system.dao.DeliveryDao;

/**
 * Servlet implementation class Customer_info
 */
public class Customer_info extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//String Cid=request.getParameter("cid");
		
		//int _cid=Integer.parseInt(Cid);
		
		Connection con=ConnectionProvider.getCon();
		
		String PFname=request.getParameter("pfname");
		
		String PLname=request.getParameter("plname");
		
		String _mobile=request.getParameter("pmobile");
		
		int Pmobile=Integer.parseInt(_mobile);
		
		String PEmail=request.getParameter("pemail");
		
		String PHouseNo=request.getParameter("phouseno");
		
		String PStreet=request.getParameter("pstreet");
		
		String PLandmark=request.getParameter("plandmark");
		
		String PCity=request.getParameter("pcity");
		
		String Pin=request.getParameter("ppincode");
		
		int PicupPinCode=Integer.parseInt(Pin);
	//........................................
		//..product information
		String Category=request.getParameter("category");
		
		String DeliverOption=request.getParameter("deliveroption");
		
		String TimeSlot=request.getParameter("timeslot");
		
		String wght=request.getParameter("weight");
		
		int Weight=Integer.parseInt(wght);
		
		//...............................
		//..Delivery customer info..
		
String DyFname=request.getParameter("dname");
		
		String DyLname=request.getParameter("dname");
		
		String Dmobile=request.getParameter("dmobile");
		
		long Dymobile=Long.parseLong(Dmobile);
		
		String DyEmail=request.getParameter("demail");
		
		String DyHouseNo=request.getParameter("dhouseno");
		
		String DyStreet=request.getParameter("dstreet");
		
		String DyLandmark=request.getParameter("dlandmark");
		
		String DyCity=request.getParameter("dcity");
		
		String DPin=request.getParameter("dpincode");
		
		int DyPinCode=Integer.parseInt(Pin);
		
		//................................
		
		DeliveryDao dd=new DeliveryDao(); 
		
		dd.addPickupData(PFname,PLname,Pmobile,PEmail,PHouseNo,PStreet,PLandmark,PCity,PicupPinCode,con);
		
		//dd.addPickupData("rajesh", "didshe", 9765577124l, "rajeshdidshe@gmail.com", "A41", "Anand Nagwr", "temple", "yavatmal", 445301, con);
	}

}
