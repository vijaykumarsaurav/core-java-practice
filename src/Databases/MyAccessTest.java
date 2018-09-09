package Databases;
import java.sql.*;
import javax.swing.*;

 abstract class Access
 {	
	public static Connection con  = null;
	private static String userName = "root";
	private static String password = "";
	private static String dataBase = "vijay";
	private static String url      = "jdbc:odbc:dk" + dataBase;
	
	public static void openConnection()
	{
    	try{
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
      		con=DriverManager.getConnection("jdbc:odbc:access"+dataBase);
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
class MyAccessTest
{
	public static void main(String arr[])
	{
		Access.openConnection();
		
 		//String query="Create table login1(name varchar(20),pass varchar(20))";
 		String q = "select * from login";
 		
		try{
 		//Access.con.createStatement().executeUpdate(query);
		 ResultSet rs=	Access.con.createStatement().executeQuery(q);
	 		while(rs.next())
	 		{
	 			System.out.println(rs.getString(0));		
	 			System.out.println(rs.getString(1));
	 		}
 		JOptionPane.showMessageDialog(null,"Sucessesfulll", "good............", 1);
 		}
 		catch(Exception e){JOptionPane.showMessageDialog(null, e, "Error............", 1);}
 	

	}

}
