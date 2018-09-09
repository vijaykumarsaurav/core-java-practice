//This Example demonstrates how to get Scrollable ResultSet using PreparedStatement and various cursor movement methods

package com.santosh.jdbc;
 
import java.util.*;
import java.io.*;
import java.sql.*;
/**
 * @author Santosh
 */
public class ScrollableRSEx2 {

public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName( 
						"oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","vijay");
		p.put("password","kumar");

		Connection con=d.connect(
								"jdbc:oracle:thin:@localhost:1521:xe",p);

PreparedStatement ps= con.prepareStatement (
"select * from mytable", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

ResultSet rs=ps.executeQuery();

System.out.println("Index\tEmpNo\tName");
int i=1;
while (rs.next()){
System.out.print((i++)+"\t");
System.out.print(rs.getString(1)+"\t");
System.out.println(rs.getString(2));
}
System.out.println();
//Now the cursor will be at afterLast
//From this point to move the cursor to 3rd record
rs.absolute(3);

System.out.println("3rd record EmpNo : "+rs.getString(1));

/*
To move the cursor to first record we can use
rs.first(); or with reference to the current row we can use
*/
rs.relative(-2);

System.out.println("1st record EmpNo : "+rs.getString(1));

/*
To move the cursor to last record use rs.last() or with reference to the current row we can use
*/
rs.afterLast(); //this moves the cursor to afterLast
rs.previous();  //moves the cursor backward by one row (which in this case moves the cursor last row

System.out.println("last record EmpNo : "+ rs.getString(1));

con.close();
}//main
}//class
