package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
	* @author Santosh
	*/
public class DBMDEx1 {
public static void main(String s[]) throws Exception {

Properties p= new Properties();
	p.load(new FileInputStream("MyDBDetails.properties"));

	Driver d= (Driver) (Class.forName((String)p.get("driver")).newInstance());

	Connection con=d.connect((String)p.get("url"), p);

	DatabaseMetaData db= con.getMetaData();

	System.out.println("Database name : "+db.getDatabaseProductName());
	System.out.println("Database version : "+db.getDatabaseProductVersion());
	System.out.println("\nDriver Name : "+ db.getDriverName());
	System.out.println("Driver Version : "+ db.getDriverVersion());
	con.close();
	}//main
}//class
