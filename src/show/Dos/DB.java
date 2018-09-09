package Dos;
import static Dos.Constent.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB 
{
	public static Connection openConnecion() throws SQLException
	{
		
		try 
		{
			Class.forName(DRIVER).newInstance();
		} 
		
		catch (ClassNotFoundException e) 
		{
			System.out.println("Driver not load properly : ");
			e.printStackTrace();
		}
		
		catch (InstantiationException e) 
		{
			e.printStackTrace();
		} 
		
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		} 
		
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	
}
