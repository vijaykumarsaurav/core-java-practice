package SingletonConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection
{
	private SingletonConnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay","root","");

	}
	
	static Connection con=null;

	/*static{
	try {
		System.out.println(" static ");
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay","root","");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}*/



public static Connection myDbConnection()
{
	System.out.println("use conn");
	
	return con;
	
	
}

}
