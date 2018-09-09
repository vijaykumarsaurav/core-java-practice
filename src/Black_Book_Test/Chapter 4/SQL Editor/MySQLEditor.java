package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class MySQLEditor {
	public static void main(String s[]) throws Exception {

		Properties p= new Properties();
		FileInputStream fis=new FileInputStream("MyDriverDetails.properties");

		p.load(fis);
		Driver d=(Driver) Class.forName((String)p.get("driverClass")).newInstance();
		Connection con=d.connect((String)p.get("url"),p);
		Statement st=con.createStatement();
		DataInputStream dis=new DataInputStream(System.in);

		System.out.println("Editor Started, Connected to DB");
		
		while (true){
			System.out.print("\nSQL>");
			String query=dis.readLine();

			boolean flag=st.execute(query);

			if (flag) {
				ResultSet rs=st.getResultSet();
				ResultSetMetaData rsmd=rs.getMetaData();
				for (int i=1;i<=rsmd.getColumnCount();i++){
					System.out.print(rsmd.getColumnName(i)+"\t");
				}
				System.out.println();
				System.out.println("---------------------------------------------------------");

				while (rs.next()) {
					for (int i=1;i<=rsmd.getColumnCount();i++){
						System.out.print(rs.getString(i)+"\t");
					}//for
					System.out.println();
				}//while
			}//if
			else {
				int count=st.getUpdateCount();
				System.out.println(count+" no(s) of records has been effected by this query");
			}//else
		}//while
	}//main
}//class
