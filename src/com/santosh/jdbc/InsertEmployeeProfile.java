package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class InsertEmployeeProfile {
public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName( 
	"oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","vijay");
		p.put("password","kumar");

		Connection con=d.connect(
			"jdbc:oracle:thin:@localhost:1521:xe",p);

		PreparedStatement ps= con.prepareStatement(
"insert into profile (empno,pro) values(?,?)");
	
		ps.setInt(1,100);
		File f=new File("../Core_Java/src/CLOB/CoverLetter.pdf");
		FileReader fr= new FileReader(f);
		ps.setCharacterStream(2,fr, (int)f.length());
		int i=ps.executeUpdate();
		System.out.println("Record inserted successfully , count : "+i);
con.close();
}//main
}//class
