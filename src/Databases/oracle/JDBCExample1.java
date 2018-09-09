package Databases.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author Santosh
 */
public class JDBCExample1
{
	public static void main(String args[])throws SQLException,ClassNotFoundException
	{
		String driverClassName="sun.jdbc.odbc.JdbcOdbcDriver";
		String url="jdbc:odbc:oracle";
		String username="vijay";
		String password="kumar";

		String query = "insert into bank values (215,'Kumar',200,300)";

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
