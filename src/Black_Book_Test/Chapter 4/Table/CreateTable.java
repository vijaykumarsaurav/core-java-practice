package com.santosh.jdbc;

import java.sql.*;
/**
 * @author Santosh
 */
public class CreateTable
{
	public static void main(String args[])throws SQLException,ClassNotFoundException
	{
		//Get Connection
		Connection con=prepareConnection(); 

		// Obtain a Statement
		Statement st=con.createStatement();
		
		String query = "create table mytable (COL1 varchar2(20), COL2 number, COL3 number(10,2))";
		
		//Execute the Query
		st.executeUpdate(query);

		System.out.println("Table Created Successfully");
	}//main

	public static Connection prepareConnection()throws SQLException,ClassNotFoundException
	{
		String driverClassName="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@mysys:1521:sandb";
		String username="scott";
		String password="tiger";
		
		//Load driver class
		Class.forName(driverClassName);

		// Obtain a connection
		Connection con=DriverManager.getConnection(url,username,password);
		return con;
	}//prepareConnection
}//class
