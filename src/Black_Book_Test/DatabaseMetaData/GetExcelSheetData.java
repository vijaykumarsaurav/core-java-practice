package com.santosh.jdbc;

import java.sql.*;
/**
 * @author  Santosh
 */
public class GetExcelSheetData {

	public static void main(String args[])throws SQLException, ClassNotFoundException {

		Connection con=prepareConnection(); 
		Statement st=con.createStatement();
		String query = "select * from [Sheet1$]";
		ResultSet rs=st.executeQuery(query);
		
		System.out.println ("COL1\tCOL2\tCOL3:");
		while (rs.next()){
		System.out.print (rs.getInt(1)+ "\t");
		System.out.print(rs.getString("col2")+ "\t");
		System.out.println (rs.getDouble("col3"));
		}//while
	}//main

	public static Connection prepareConnection()throws SQLException, ClassNotFoundException	{

		String driverClassName="sun.jdbc.odbc.JdbcOdbcDriver";
		String url="jdbc:odbc:abc";
		Class.forName(driverClassName);
		return DriverManager.getConnection(url);	
	}//prepareConnection
}//class
