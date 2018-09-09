/*
Entering a New Row into a Table
This example enters a row containing a string, an integer, and a floating point number into the table called "mytable"
*/

package Black_Book.Table;
import static Black_Book.Constent.*;
import java.sql.*;
/**
 * @author Santosh
 */
public class InsertNewRow
{
	public static void main(String args[])throws SQLException, ClassNotFoundException {

		//Get Connection
		Connection con=prepareConnection(); 

		// Obtain a Statement
		Statement st=con.createStatement();
		
		String query = "insert into mytable values ('Santosh', '36', '158.5')";
		
		//Execute the Query
		int count=st.executeUpdate(query);

		System.out.println("Number of Rows Effected by this query = "+count);
	}//main

	public static Connection prepareConnection()throws SQLException, ClassNotFoundException	{

		//Load driver class
		Class.forName(DRIVER);

		// Obtain a connection
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);		
	}//prepareConnection
}//class
