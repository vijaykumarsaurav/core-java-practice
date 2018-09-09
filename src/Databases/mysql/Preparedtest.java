package Databases.mysql;

import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

public class Preparedtest {

	
	
	public static void main(String[] args) 
    {
		try
		{
		Connection con= null;
		con = (Connection) DB.openConnecion();
		PreparedStatement pst =  con.prepareStatement("update sumsung set id=?,name=?,salary=? where id=?");
		pst.setInt(1, 1000);
		pst.setString(2, "mudul kumar");
		pst.setDouble(3, 10000);
		pst.setInt(4, 1000);
		pst.addBatch();
		
		int ch[] = pst.executeBatch();
		for (int i : ch) {
			System.out.println("no of row affected : "+i);
		}
	
		System.out.println(pst.getFetchSize());
		System.out.println(pst.getFetchDirection());
		System.out.println(pst.getMaxRows());
		System.out.println(pst.getQueryTimeout());
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
