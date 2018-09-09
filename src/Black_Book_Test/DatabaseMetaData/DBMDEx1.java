package Black_Book.DatabaseMetaData;

import static Black_Book.Constent.DRIVER;
import static Black_Book.Constent.PASSWORD;
import static Black_Book.Constent.URL;
import static Black_Book.Constent.USERNAME;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
	* @author Santosh
	*/
public class DBMDEx1 {
public static void main(String s[]) throws Exception {

	Class.forName(DRIVER);

	// Obtain a connection
	Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);

	
	
	DatabaseMetaData db= con.getMetaData();

	System.out.println("Database name : "+db.getDatabaseProductName());
	System.out.println("Database version : "+db.getDatabaseProductVersion());
	System.out.println("\nDriver Name : "+ db.getDriverName());
	System.out.println("Driver Version : "+ db.getDriverVersion());
	System.out.println("Driver Version : "+ db.getCatalogSeparator());
	System.out.println("Driver Version : "+ db.getCatalogTerm());
	
	
	con.close();
	}//main
}//class
