package com.santosh.jdbc;
import java.sql.*;
/**
* @author Santosh
*/
public class  DatabaseMetaDataEx3{
public static void main(String[] args) throws Exception
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con =
	DriverManager.getConnection("jdbc:odbc:oracle", "vijay","kumar");

	DatabaseMetaData db=con.getMetaData();
	ResultSet rs=db.getColumns(null,null,"bank","%");

	System.out.print("Catalog_Name\t");
	System.out.print("Schema\t");
	System.out.print("Table_Name\t");
	System.out.print("Col_Name\t"); 
	System.out.print("Col_Type(JDBC)\t");
	System.out.println("Col_Type(DB)");
	System.out.println("--------------------------------------------------------------------------------------");

	while(rs.next())
	{
		System.out.print(rs.getString(1)+"\t\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t\t");
		System.out.print(rs.getString(4)+"\t\t"); 
		System.out.print(rs.getString(5)+"\t\t");
		System.out.println(rs.getString(6));
	}//while
	rs.close();
	con.close();
	}//main
}//class
