package SingletonConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB 
{
	
	static Connection con=null;
	
	static
	{
		
		try 
		{
			System.out.println(" static ");
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay","root","");
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	
	public static Connection openConnection() throws ClassNotFoundException, SQLException
	{	
		if (con != null)
		{
			return con;
		}
		else 
		{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay","root","");
			
		}
	
	}

}
