package DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Enumeration;

import javax.swing.JOptionPane;

abstract class MainToMySql{	
	public static Connection con  = null;
	private static String userName = "root";
	private static String password = "";
	private static String dataBase = "test";
	private static String url      = "jdbc:mysql://localhost:3306/" + dataBase;
	

	public static void openConnection(){
		try{
			Class.forName( "com.mysql.jdbc.Driver").newInstance();
	  		con = DriverManager.getConnection (url, userName, password);            
	  }
	    catch (Exception e){
	        JOptionPane.showMessageDialog(null,"driver not load  :"+e);
	    }
	}
	 
	public static void closeConnection(){
	 	try{ con.close(); 
	 	} 
	 	catch (Exception e){
	    }
	}            
	}  

public class MysqlTest {

	public static void main(String[] args)
	{

		MainToMySql.openConnection();
 		String query="Create table Raj1(name varchar(20),pass varchar(20))";
 		try{
 		MainToMySql.con.createStatement().executeUpdate(query);
 		JOptionPane.showMessageDialog(null,"Sucessesfully created", "Wow", 1);
 		}
 		catch(Exception e){JOptionPane.showMessageDialog(null, e, "Error............", 1);}
 			
	}

}

