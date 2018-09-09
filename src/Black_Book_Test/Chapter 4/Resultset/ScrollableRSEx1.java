//Example to demonstrate Scrollable ResultSet
package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class ScrollableRSEx1 {
	public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName( 
						"oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","scott");
		p.put("password","tiger");

		Connection con=d.connect(
								"jdbc:oracle:thin:@mysys:1521:sandb",p);

		Statement st= con.createStatement(
							ResultSet.TYPE_SCROLL_INSENSITIVE, 	 							ResultSet.CONCUR_READ_ONLY);
	
		String query="select * from emp where deptno=10";

		ResultSet rs= st.executeQuery(query);
//Now the cursor of resultset will at beforeFirst & the result set produced is scrollable

		System.out.println("EmpNo\tName");

		while (rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.println(rs.getString(2));
		}//while
//Now the cursor of resultset will at afterLast

		System.out.println("Reading Data, moving the cursor in backward direction\n");

		while (rs.previous()){
			System.out.print(rs.getInt(1)+"\t");
			System.out.println(rs.getString(2));
		}//while
		con.close();
	}//main
}//class
