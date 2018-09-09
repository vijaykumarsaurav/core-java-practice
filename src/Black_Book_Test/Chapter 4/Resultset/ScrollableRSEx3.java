package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
	* @author Santosh
	*/
public class ScrollableRSEx3 {
	public static void main(String s[]) throws Exception {

		Driver d= (Driver) (
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","scott");
		p.put("password","tiger");

		Connection con1=d.connect("jdbc:oracle:thin:@localhost:1521:orcl",p);
		Connection con2=d.connect("jdbc:oracle:thin:@localhost:1521:orcl",p);

		Statement st1= con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		Statement st2= con2.createStatement();
	
		String query="select * from emp where deptno=10";

		ResultSet rs= st1.executeQuery(query);
		System.out.println("EmpNo\tName");
		System.out.println("----------------------------------");
		while (rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.println(rs.getString(2));
		}//while

		st2.executeUpdate ("update emp set ename=\'kumar\' where empno=7934");

		System.out.println("\nData Modified: \nName of the employee with empno - 7934 is modified from \'MILLER\' to \'kumar\'\n");
		
		System.out.println("Now reading the data once again from the same ResultSet\n");

		rs.beforeFirst();
		while (rs.next()){
			System.out.print(rs.getInt(1)+"\t");
			System.out.println(rs.getString(2));
		}//while
		con1.close();
		con2.close();
	}//main
}//class
