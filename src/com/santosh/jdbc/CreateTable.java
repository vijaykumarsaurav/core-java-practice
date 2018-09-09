package com.santosh.jdbc;
import static Black_Book.Constent.*;
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
		
		String query = "create table nowTable (COL1 varchar2(20), COL2 number, COL3 number(10,2))";
		
		//Execute the Query
		st.executeUpdate(query);

		System.out.println("Table Created Successfully");
	}//main

	public static Connection prepareConnection()throws SQLException,ClassNotFoundException
	{	
		//Load driver class
		Class.forName(DRIVER);

		// Obtain a connection
		Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		return con;
	}//prepareConnection
}//class
