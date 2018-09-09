package com.santosh.jdbc;

import java.sql.*;
/**
 * @author Santosh
 */
public class GetData {

	public static void main(String args[])throws SQLException, ClassNotFoundException {
//try{
		//Get Connection
		Connection con=prepareConnection(); 

		// Obtain a Statement
		Statement st=con.createStatement();
		
		String query = "select col3, col1 from mytable";
		
		//Execute the Query
		ResultSet rs=st.executeQuery(query);
		
//		System.out.println ("COL1\tCOL3");
		while (rs.next()){
			System.out.print (rs.getString(2)+ "\t");
			System.out.println (rs.getDouble(1));
		}//while
			System.out.print (rs.getString(2)+ "\t");
//}catch(SQLException e){System.out.println(e.getErrorCode());}
	}//main

	public static Connection prepareConnection()throws SQLException, ClassNotFoundException	{

String driverClassName="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@mysys:1521:sandb";
/*
String driverClassName="sun.jdbc.odbc.JdbcOdbcDriver";
		String url="jdbc:odbc:santoshDSN";
*/		String username="scott";
		String password="tiger";
		
		//Load driver class
		Class.forName(driverClassName);

		// Obtain a connection
		return DriverManager.getConnection(url,username,password);		
	}//prepareConnection
}//class
