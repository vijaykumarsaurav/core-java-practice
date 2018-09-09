package Dos;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLEditor {

	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement 	st = null;

		String tablename=null,name = null;
		double salary = 0;
		
		try {
			con = DB.openConnecion();
			st = con.createStatement();
		} catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		System.out.println("Our SQL editor connected to Database  ");
		
		while(true)
		{
	
		try 
		{	
			System.out.print("\nSQL>");
			String sql =new  Scanner(System.in).nextLine();		
			if(st.execute(sql))
			{
					ResultSet rs2 =	st.getResultSet();
					ResultSetMetaData rsm =  rs2.getMetaData();
					System.out.println();
				 	for(int i=1; i<=rsm.getColumnCount();i++)
				 	{
				 		System.out.print(rsm.getColumnName(i)+"\t\t");
				 	}
				 	System.out.println();
				 	for(int i=1; i<=rsm.getColumnCount();i++)
				 	{
				 		System.out.print("=================================");
					 }
				 	System.out.println();
				 	while(rs2.next())
					{
						for (int ii=1;ii<=rsm.getColumnCount();ii++)
							System.out.print(rs2.getString(ii)+"\t\t");
						System.out.println("\n");
						
					}

			}
			else
			{
				System.out.println("No. of rows affected :"+st.getUpdateCount());
			}
			}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		//	e.printStackTrace();
		}
		
		
		
		} 
		
		
	
	
	}

}
