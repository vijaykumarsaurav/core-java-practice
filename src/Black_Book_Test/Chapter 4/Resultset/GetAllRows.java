package Black_Book.Resultset;
import static Black_Book.Constent.*;
import java.sql.*;
/**
 * @author Santosh
 */
public class GetAllRows {

	public static void main(String args[])throws 
	SQLException, ClassNotFoundException {

		//Get Connection
		Connection con=prepareConnection (); 

		// Obtain a Statement
		Statement st=con.createStatement ();
		String query = "select * from mytable";
		
		//Execute the Query
		ResultSet rs=st.executeQuery (query);
		
		System.out.println ("COL1\tCOL2\tCOL3");
                while (rs.next ()){
                	rs.getString(1);
        
//                	if(rs.wasNull())
//            				System.out.print ("vijay" + "\t");
//                        
//		System.out.print (rs.getInt ("COL2") + "\t");
//		System.out.println (rs.getDouble ("COL3"));
		}//while
		con.close ();
	}//main

	public static Connection prepareConnection()
		throws SQLException,
 		ClassNotFoundException	{

		//Load driver class
		Class.forName (DRIVER);

		// Obtain a connection
		return DriverManager. getConnection (URL, USERNAME, PASSWORD);
	}//prepareConnection
}//class

