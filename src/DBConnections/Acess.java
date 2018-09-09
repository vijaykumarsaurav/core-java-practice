package DBConnections;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Acess {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			Connection con= DriverManager.getConnection("jdbc:odbc:access");
			
			Statement st = con.createStatement();
			String str = "select * from Test";
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
