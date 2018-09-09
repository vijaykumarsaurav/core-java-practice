package string;
import java.sql.*;

 public class Test  
{
		public Statement stmt = null;
		private Connection con = null;
		private String userName = "root";
		private String password = "ignou";
		private String dataBase ="client";
		private String url = "jdbc:mysql://localhost/" + dataBase;
	
		void display() 
		{
			System.out.println("vijay kuar");	
			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//org.gjt.mm.mysql.Driver is also support in core java
				con = DriverManager.getConnection (url, userName, password);
				stmt = con.createStatement();
				}
			catch (ClassNotFoundException e1)
			{
				System.out.println("class not load");
			}
			catch (SQLException e)
			{
				System.out.println("sql error");
			}

			try
			{
				String sql="create table test(name varchar(25))";
				
				stmt.executeUpdate(sql);
				
			 }
			catch(SQLException e)
			{
				System.out.println("sql error");	
			}	
		}
		public static void main(String s[])
		{
			new Test().display();
		}
}
