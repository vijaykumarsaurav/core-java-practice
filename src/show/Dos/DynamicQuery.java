package Dos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicQuery
{

public static void main(String[] args)
{
		Connection con = null;
		Statement 	st = null;   

		String tablename=null,name = null,sql=null;
		double salary = 0;
		int id=0;

		try 
		{
			con = DB.openConnecion();
			st = con.createStatement();
					
			System.out.print("Enter the Table name :");
			tablename = new Scanner(System.in).nextLine();
			
			String tc ="create table "+tablename+"(id integer, name varchar(50),salary double)";
					
			int c = st.executeUpdate(tc);
			System.out.println("Table created \n");
	
			
			while (true)
			{
			System.out.println("Use Operation  ");
			System.out.println("1. Insertion  \n\n2. Display  \n\n3. Delete \n\n4. Exit \n");
			
			System.out.print("Enter your choice  :");
			int choice   = new Scanner(System.in).nextInt();
			String sql1 =null ;
			if (choice == 1)
			{
				while (true)
				{
					
				System.out.print("Enter the emplyee id  :");
				id = new Scanner(System.in).nextInt();
			
				System.out.print("Enter the emplyee name :");
				name = new Scanner(System.in).nextLine();
				
				System.out.print("Enter the salary :");
				salary = new Scanner(System.in).nextDouble();
				
				sql1 = "insert into "+tablename+" values("+id+",'"+name+"',"+salary+")";	
				st.addBatch(sql1);
				System.out.print("Do you want to contitue (yes/no) :");
				String ch = new Scanner(System.in).nextLine();
				if(ch.equalsIgnoreCase("yes"))
					continue ;
				else 
					break;
				}
				int ch [] = st.executeBatch();
				int ii=1;
				for (int i : ch) 
				{
					System.out.println( ii+ " Executed : "+ i);
				}
				st.clearBatch();
			}
			else if(choice  ==  2)
			{		
				sql = "select * from "+tablename;
			}
			else if (choice == 3)
			{
				System.out.print("Enter the emplyee id  for delete  :");
				id = new Scanner(System.in).nextInt();
				sql = "delete from "+tablename+ " where id="+id;				
			}
			else 
				System.exit(1);
			
			if(sql != null)
			{
			if (st.execute(sql))
			{
					ResultSet rs2 =	st.getResultSet();
					System.out.println(" Displayed the data :  ");
					while (rs2.next())
						System.out.println("Id : "+rs2.getString(1)+"\tName :"+rs2.getString(2) +"\tSalary :"+rs2.getDouble(3));
			}
			else 
				System.out.println("No. of Row affected :"+st.getUpdateCount());
			}

			System.out.println("\n");
			
			}
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
