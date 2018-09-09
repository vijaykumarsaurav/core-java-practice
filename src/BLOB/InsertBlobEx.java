package BLOB;



import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class InsertBlobEx {
public static void main(String s[]) throws Exception {

	 String DRIVER   = "oracle.jdbc.OracleDriver";
	 String USERNAME = "vijay";
	 String PASSWORD = "kumar";
	 String URL      = "jdbc:oracle:thin:@localhost:1521:xe";
	 
		Driver d= (Driver) ( Class.forName(DRIVER).newInstance());

		Properties p=new Properties ();
		p.put("user","vijay");
		p.put("password","kumar");

		Connection con=d.connect(URL,p);

		PreparedStatement ps= con.prepareStatement(
"insert into personaldetails(empno,photo) values(?,?)");

		ps.setInt(1,200);
		File f=new File("F:/Videos/Bollywood/AVI/baamulaiza.wmv");
		FileInputStream fis= new FileInputStream(f);
		ps.setBinaryStream(2,fis, (int)f.length());
		int i=ps.executeUpdate();
		System.out.println("Record inserted successfully , count : "+i);
con.close();
}//main
}//class
