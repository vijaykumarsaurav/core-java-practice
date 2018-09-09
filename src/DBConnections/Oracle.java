package DBConnections;


import java.sql.*;

import javax.swing.JOptionPane;

public class Oracle
{
	public static void main(String args[])throws SQLException,ClassNotFoundException
	{
		String driverClassName="sun.jdbc.odbc.JdbcOdbcDriver";
		String url="jdbc:odbc:oracle";
		String username="vijay";
		String password="kumar";

	//	String query = "insert into Test values ('Hi',50,500)";
                String query  = "create table test4 (COL1 varchar2(20), COL2 number, COL3 number(10,2))";
		//Load driver class
		Class.forName(driverClassName);

		// Obtain a connection
		Connection con=DriverManager.getConnection(url,username,password);

		// Obtain a Statement
		Statement st=con.createStatement();
		
		//Execute the Query
		int count=st.executeUpdate(query);
		JOptionPane.showMessageDialog(null,"Sucessesfully Created", "Oracle............", 1);
		System.out.println("Number of Rows Effected by this query = "+count);
	}//main
}//class
