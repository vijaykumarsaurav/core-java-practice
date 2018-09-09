package Black_Book.ResultSetMetaData;

import static Black_Book.Constent.DRIVER;
import static Black_Book.Constent.PASSWORD;
import static Black_Book.Constent.URL;
import static Black_Book.Constent.USERNAME;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */

public class ResultSetMDEx {

	public static void main(String s[]) throws Exception {
		Driver d= (Driver) ( Class.forName(DRIVER).newInstance());
		Properties p=new Properties ();
		p.put("user",USERNAME);
		p.put("password",PASSWORD);
		Connection con=d.connect(URL,p);

		Statement st = con.createStatement();

		ResultSet rs=st.executeQuery("select * from  bank");
		//Table name is taken as an command line arg

		ResultSetMetaData rsmd=rs.getMetaData();

		System.out.println("Table Name : ");
		
		int colcount=rsmd.getColumnCount();

		System.out.println(colcount);
		for (int i=1;i<=colcount;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
			System.out.print(rsmd.getColumnTypeName(i)+"\t");
			System.out.print(rsmd.getColumnDisplaySize(i)+"\t");
			System.out.println();
			
		}//fo

		System.out.print("rsmd.getCatalogName(2)"+rsmd.getCatalogName(2)+"\n");
		System.out.print("rsmd.getCatalogName(1)"+rsmd.getColumnLabel(1)+"\n");
		System.out.print("rsmd.getCatalogName(2)"+rsmd.getSchemaName(2)+"\n");
		

		con.close();
	}//main
}//class
