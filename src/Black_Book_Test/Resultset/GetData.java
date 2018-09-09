package Black_Book.Resultset;

import static Black_Book.Constent.DRIVER;
import static Black_Book.Constent.PASSWORD;
import static Black_Book.Constent.URL;
import static Black_Book.Constent.USERNAME;

import java.sql.*;
/**
 * @author Santosh
 */
public class GetData {

	public static void main(String args[])throws SQLException, ClassNotFoundException {
try{
		//Get Connection
		Connection con=prepareConnection(); 

		// Obtain a Statement
		Statement st=con.createStatement();
		
		String query = "select col3 as c1 , col1 as c2 from mytable";
		
		//Execute the Query
		ResultSet rs=st.executeQuery(query);
		
//		System.out.println ("COL1\tCOL3");
		while (rs.next()){
			
			System.out.print (rs.getString("c2")+ "\t");
			System.out.println (rs.getDouble("c1"));
		}//while
		
		//System.out.print (rs.getString(2)+ "\t");
}catch(SQLException e){System.out.println(e.getErrorCode());}
	}//main

	public static Connection prepareConnection()throws SQLException, ClassNotFoundException	{

		//Load driver class
		Class.forName (DRIVER);

		// Obtain a connection
		return DriverManager. getConnection (URL, USERNAME, PASSWORD);
	}//prepareConnection
}//class
