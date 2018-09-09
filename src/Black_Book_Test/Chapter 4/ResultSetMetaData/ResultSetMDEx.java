package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */

public class ResultSetMDEx {

	public static void main(String s[]) throws Exception {
		Driver d=(Driver) Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();

		Properties p= new Properties();
		p.put("user", "scott");
		p.put("password", "tiger");

		Connection con=d.connect("jdbc:oracle:thin:@mysys:1521:sandb",p);

		Statement st = con.createStatement();

		ResultSet rs=st.executeQuery("select * from "+s[0]);
		//Table name is taken as an command line arg

		ResultSetMetaData rsmd=rs.getMetaData();

		System.out.println("Table Name : "+s[0]);
		
		int colcount=rsmd.getColumnCount();

		for (int i=1;i<=colcount;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
			System.out.println(rsmd.getColumnTypeName(i));
		}//for

		con.close();
	}//main
}//class
