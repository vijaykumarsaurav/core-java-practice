package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class GetEmployeeProfile {
	
	public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName( 
	"oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","vijay");
		p.put("password","kumar");

		Connection con=d.connect(
			"jdbc:oracle:thin:@localhost:1521:xe",p);

Statement st=con.createStatement();
ResultSet rs=st.executeQuery( "select pro from profile where empno=100");

while (rs.next()) {
Reader r=rs.getCharacterStream(1);

FileWriter fw=new FileWriter("C:\\Users\\Vijay\\Desktop\\Job Portal\\cover"+".pdf");

int i=r.read();
while (i!=-1){
fw.write(i);
i=r.read();
}//while

}//while
System.out.println("Profile retrived");
con.close();
}//main
}//class
