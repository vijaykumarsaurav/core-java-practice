package com.santosh.jdbc;

import java.sql.*;
/**
 * @author Santosh
 */
public class CallableStatementEx1 {

	public static void main(String s[]) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@mysys:1521:sandb","scott","tiger");
		
		//Step1: Get CallableStatement
		CallableStatement cs= con.prepareCall("{call createAccount (?,?,?,?,?,?)}");
		
		//Step2: set IN parameters
		cs.setInt(1, 101);
		cs.setInt(2, 10);
		cs.setString(3, "Santosh");
		cs.setDouble(4, 10000);
		cs.setString(5, "Hyderabad");
		cs.setInt(6, 123456789);
		
		//Step3 : register OUT parameters
		//In this procedure example we dont have OUT parameters 

		//Step4
		cs.execute();

		System.out.println("Account Created");
		
		con.close();
	}//main
}//class
