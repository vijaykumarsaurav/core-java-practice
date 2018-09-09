package Black_Book.Resultset;

import static Black_Book.Constent.DRIVER;
import static Black_Book.Constent.PASSWORD;
import static Black_Book.Constent.URL;
import static Black_Book.Constent.USERNAME;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */
public class RemoveEmployee  {
public static void main(String s[]) throws Exception {


	Driver d= (Driver) ( Class.forName(DRIVER).newInstance());

	Properties p=new Properties ();
	p.put("user",USERNAME);
	p.put("password",PASSWORD);

	Connection con=d.connect(URL,p);

Statement st=con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

ResultSet rs= st.executeQuery("select COL1, COL2, COL3 from mytable");

DatabaseMetaData dbmd=con.getMetaData();

if(dbmd.ownDeletesAreVisible (ResultSet.TYPE_SCROLL_SENSITIVE))
	
System.out.println("Deletions are visible as a change for this ResultSet object");
else
System.out.println("Deletions are not visible as a change for this ResultSet object");

System.out.println();
System.out.println("Empno\tName\tSalary\tDeptno");
System.out.println("------------------------------");

while (rs.next()) {
System.out.print(rs.getString(1)+"\t");
System.out.print(rs.getInt(2)+"\t");
System.out.print(rs.getInt(3)+"\t");

if (rs.getInt(2)==100) 
{
rs.deleteRow();
System.out.print("Employee Removed");
}//if
System.out.println();
}//while
con.close();
}//main
}//class
