//Example to demonstrate Scrollable ResultSet
package Black_Book.Resultset;

import static Black_Book.Constent.DRIVER;
import static Black_Book.Constent.PASSWORD;
import static Black_Book.Constent.URL;
import static Black_Book.Constent.USERNAME;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class ScrollableRSEx1 {
	public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName(DRIVER).newInstance());
		Properties p=new Properties ();
		p.put("user",USERNAME);
		p.put("password",PASSWORD);
		Connection con=d.connect(URL,p);

		Statement st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	
		String query="select * from mytable where col2=1000";

		ResultSet rs= st.executeQuery(query);
//Now the cursor of resultset will at beforeFirst & the result set produced is scrollable

		System.out.println("EmpNo\tName");

		while (rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.println(rs.getInt(2));
		}//while
//Now the cursor of resultset will at afterLast

		System.out.println("Reading Data, moving the cursor in backward direction\n");

		while (rs.previous()){
			System.out.print(rs.getString(1)+"\t");
			System.out.println(rs.getInt(2));
		}//while
		con.close();
	}//main
}//class
