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
public class IncrementSalary  {
	public static void main(String s[]) throws Exception
	{
		ResultSet rs=null;
		Driver d= (Driver) ( Class.forName(DRIVER).newInstance());

		Properties p=new Properties ();
		p.put("user",USERNAME);
		p.put("password",PASSWORD);

		Connection con=d.connect(URL,p);

		Statement st=con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		rs= st.executeQuery("select COL1, COL2, COL3 from mytable");

		System.out.println("Name\tSalary\tDeptno");
		System.out.println("------------------------------");
		while (rs.next()) 
		{
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getInt(2)+"\t");
			System.out.print(rs.getInt(3)+"\t");

			System.out.println();
		}//while

		st.executeUpdate("update mytable set col1 = 'black book' where col1='mobile'");

		System.out.println("\n\nchanced Name\tSalary\tDeptno");
		//rs.beforeFirst();
		rs= st.executeQuery("select COL1, COL2, COL3 from mytable");
		while (rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getInt(2)+"\t");
			System.out.print(rs.getInt(3)+"\n");
		}
		con.close();
	}//main
}//class
