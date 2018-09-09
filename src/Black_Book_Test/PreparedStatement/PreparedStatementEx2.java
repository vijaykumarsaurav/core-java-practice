package Black_Book.PreparedStatement;
import static Black_Book.Constent.*;
import java.text.*;
import java.sql.*;
/**
 * @author vijay
 */

public class PreparedStatementEx2 {

	public static void main(String s[]) throws Exception {

		Class.forName(DRIVER).newInstance();
		Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		String query="update emp set HIREDATE=?,ENAME=? where empno=?";

		//Step1: Get PreparedStatement
		PreparedStatement ps=con.prepareStatement(query);
		
		//Prepare java.sql.Date object
		/*
		This logic shows how to convert simple String that is in 
		dd-MM-yyyy format into Date object
		*/
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date d=sdf.parse("26-5-2001");
		java.sql.Date newdate=new java.sql.Date(d.getTime());

		//Step2: set parameters
		ps.setDate(1,newdate);
		ps.setString(2,"Santosh");
		ps.setInt(3,100);
		
		//Step3: execute the query
		int i=ps.executeUpdate();

		System.out.println("record updated count: "+i);
		con.close();
	}//main
}//class
