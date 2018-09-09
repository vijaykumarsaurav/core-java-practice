package com.santosh.jdbc;

import java.sql.*;
/**
 * @author Santosh
 */
public class JDBCExample1
{
	public static void main(String args[])throws SQLException,ClassNotFoundException
	{
		String driverClassName="sun.jdbc.odbc.JdbcOdbcDriver";
		String url="jdbc:odbc:oracle";
		String username="scott";
		String password="tiger";

		String query = "insert into Test values (100, \'Kumar\')";

		//Load driver class
		Class.forName(driverClassName);

		// Obtain a connection
		Connection con=DriverManager.getConnection(url,username,password);

		// Obtain a Statement
		Statement st=con.createStatement();
		
		//Execute the Query
		int count=st.executeUpdate(query);

		System.out.println("Number of Rows Effected by this query = "+count);
	}//main
}//class
