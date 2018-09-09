package BLOB;

import java.sql.*;
import java.util.*;
import java.io.*;

public class InsertBlobEx {
public static void main(String s[]) throws Exception {


		Driver d= (Driver) ( Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance());
		Properties p=new Properties ();
		p.put("user","vijay");
		p.put("password","kumar");
		Connection con=d.connect("jdbc:odbc:oracle",p);
		
		PreparedStatement ps= con.prepareStatement(
"insert into personaldetails(empno,photo) values(?,?)");

		ps.setInt(1,100);
		File f=new File("../editor/src/BLOB/MyImage.gif");
		FileInputStream fis= new FileInputStream(f);
		ps.setBinaryStream(2,fis, (int)f.length());
		int i=ps.executeUpdate();
		System.out.println("Record inserted successfully , count : "+i);
con.close();
}//main
}//class
