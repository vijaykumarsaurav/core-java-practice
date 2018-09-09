package com.santosh.jdbc;
import java.sql.*;
//import org.apache.commons.dbcp.*;
/**
 * @author Santosh
 */
public class ConnectionPoolTest {
	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		long beforeTime=System.currentTimeMillis();
		for (int i=0;i<=15;i++) {
			Connection con= DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"vijay", "kumar");
			con.close(); 
		}
		long afterTime=System.currentTimeMillis();
		
		System.out.println("Time taken to create 16 database connections;\n without using connection pool: "+ (afterTime-beforeTime)+" milli seconds\n\n");

		//Now get connections using connection pool
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("system");
		dataSource.setPassword("tiger");
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");

		beforeTime=System.currentTimeMillis();
		for (int i=0;i<=10000;i++) {
			Connection con= dataSource.getConnection();
			con.close(); 
		}
		afterTime=System.currentTimeMillis();
		System.out.println("Time taken to create 10001 database connections;\n with using connection pool: "+ (afterTime-beforeTime)+" milli seconds");
	}
}
