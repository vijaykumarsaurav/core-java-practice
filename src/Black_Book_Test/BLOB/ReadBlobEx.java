package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class ReadBlobEx {
public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName( 
	"oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","scott");
		p.put("password","tiger");

		Connection con=d.connect(
			"jdbc:oracle:thin:@mysys:1521:sandb",p);

Statement st=con.createStatement();
ResultSet rs=st.executeQuery( "select * from personaldetails");

while (rs.next()) {
int empno=rs.getInt(1);

InputStream is=rs.getBinaryStream(2);

FileOutputStream fos=new FileOutputStream("MyImg"+empno+".gif");

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
