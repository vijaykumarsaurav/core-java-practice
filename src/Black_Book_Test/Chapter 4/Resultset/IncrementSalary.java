package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */
public class IncrementSalary  {
public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName( 
	"oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","scott");
		p.put("password","tiger");

		Connection con=d.connect(
			"jdbc:oracle:thin:@mysys:1521:sandb",p);

Statement st=con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

ResultSet rs= st.executeQuery("select empno, ename, sal, deptno from emp");

System.out.println("Empno\tName\tSalary\tDeptno");
System.out.println("------------------------------");
while (rs.next()) {
System.out.print(rs.getInt(1)+"\t");
System.out.print(rs.getString(2)+"\t");
System.out.print(rs.getDouble(3)+"\t");
System.out.print(rs.getInt(4)+"\t");

if (rs.getDouble(3)>2000) {
double amt=rs.getDouble(3)*1.1;
rs.updateDouble(3,amt);
rs.updateRow();
System.out.print("Salary Incremented");
}//if
System.out.println();
}//while
con.close();
}//main
}//class
