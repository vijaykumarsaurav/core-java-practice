package BLOB;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class ReadBlobEx {
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

Statement st=con.createStatement();
ResultSet rs=st.executeQuery( "select * from personaldetails");

while (rs.next()) {
int empno=rs.getInt(1);

InputStream is=rs.getBinaryStream(2);

FileOutputStream fos=new FileOutputStream("C:/Users/Vijay/Desktop/Job Portal/video"+empno+".wmv");

int i=is.read();
while (i!=-1){
fos.write(i);
i=is.read();
}//while

}//while
System.out.println("Image's retrived");
con.close();
}//main
}//class
