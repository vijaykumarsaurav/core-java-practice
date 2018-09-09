package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */
public class RemoveEmployee  {
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

DatabaseMetaData dbmd=con.getMetaData();

if(dbmd.ownDeletesAreVisible (ResultSet.TYPE_SCROLL_SENSITIVE))
System.out.println("Deletions are visible as a change for this ResultSet object");
else
System.out.println("Deletions are not visible as a change for this ResultSet object");

System.out.println();
System.out.println("RowNo\tEmpno\tName\tSalary\tDeptno");
System.out.println("------------------------------");

while (rs.next()) {
System.out.print(rs.getRow()+"\t");
System.out.print(rs.getInt(1)+"\t");
System.out.print(rs.getString(2)+"\t");
System.out.print(rs.getDouble(3)+"\t");
System.out.print(rs.getInt(4)+"\t");

if (rs.getInt(1)==Integer.parseInt(s[0])) {
rs.deleteRow();
System.out.print("Employee Removed");
}//if
System.out.println();
}//while
con.close();
}//main
}//class
