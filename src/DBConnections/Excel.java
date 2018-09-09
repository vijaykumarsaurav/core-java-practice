package DBConnections;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Excel {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			Connection con= DriverManager.getConnection("jdbc:odbc:excel");
			
			Statement st = con.createStatement();
			String str = "select * from [Sheet1$]";
			ResultSet rs =  st.executeQuery(str);
			
			System.out.println("Col1\tCol2\tCol3\n==================================");
			while(rs.next())
			{
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString("col2")+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println();
			}

		
con.close();
	}
}
