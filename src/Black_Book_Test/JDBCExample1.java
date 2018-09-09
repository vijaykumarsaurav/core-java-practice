package Black_Book;

import static Black_Book.Constent.*;


import java.sql.*;
/**
 * @author Santosh
 */
public class JDBCExample1
{
	public static void main(String args[])throws SQLException,ClassNotFoundException
	{

		String query = "insert into Test values (200, \'vijay\')";

		//Load driver class
		Class.forName(DRIVER);

		// Obtain a connection
		Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);

		// Obtain a Statement
		Statement st=con.createStatement();
		
		//Execute the Query
		int count=st.executeUpdate(query);

		System.out.println("Number of Rows Effected by this query = "+count);
	}//main
}//class
