package Databases.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.ResultSetMetaData;

public class StatementTest {

	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement 	st = null;

		String tablename=null,name = null;
		double salary = 0;

		try 
		{
			con = DB.openConnecion();
			st = con.createStatement();
	
			System.out.print("Enter the Table name :");
			tablename = new Scanner(System.in).nextLine();
			
			String tc ="create table "+tablename+"(name varchar(50),salary double)";
					
			int c = st.executeUpdate(tc);
			System.out.println("Table created");
	
			System.out.print("Enter the emplyee name :");
			name = new Scanner(System.in).nextLine();
			System.out.print("Enter the salary :");
			salary = new Scanner(System.in).nextDouble();
		
			String s = "insert into "+tablename+" values('"+name+"',"+salary+")";
			
			int count = st.executeUpdate(s);
			System.out.println("Number of rows affected :"+count);
		
			System.out.println("Through executeQuery() ");
			ResultSet rs = st.executeQuery("select * from "+tablename);
			while (rs.next())
				System.out.println("Name :"+rs.getString(1) +"   Salary :"+rs.getDouble(2));
			
			System.out.println("\n");	
			
			
			if(st.execute(s))
			{
					
					ResultSet rs2 =	st.getResultSet();
					java.sql.ResultSetMetaData rsm =  rs2.getMetaData();
				 	
				 	for(int i=0; i<rsm.getColumnCount();i++)
				 	{
				 		System.out.println(rsm.getCatalogName(i)+"\t");
				 	}
					System.out.println("Through execute() ");
					while (rs2.next())
						System.out.println("Name :"+rs2.getString(1) +"   Salary :"+rs2.getDouble(2));
			}
			else 
				System.out.println(st.getUpdateCount());
			
			String bs = "insert into "+tablename+" values('"+name+"',"+salary+")";
			
			//batch update
			st.addBatch(bs);
			st.addBatch(bs);
			st.addBatch(bs);
			int ch [] = st.executeBatch();
			for (int i : ch) {
				System.out.println("Executed : "+ i);
			}
			System.out.println("\n");
			
			
		} 
		catch (SQLException e) 
		{
			System.out.println("SQL exception :");
			e.printStackTrace();
		}
		
		finally
		{
			try {
				con.close();
				st.close();
			} catch (SQLException e) {
				System.out.println("Connection closeing error :");
				e.printStackTrace();
			}
			
		}
	
	}

}
