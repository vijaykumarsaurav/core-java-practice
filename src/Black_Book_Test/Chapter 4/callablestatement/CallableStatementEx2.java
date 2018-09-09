package com.santosh.jdbc;

import java.sql.*;
/**
 * @author Santosh
 */
public class CallableStatementEx2 {
public static void main(String s[]) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		Connection con=DriverManager.getConnection(
			"jdbc:oracle:thin:@mysys:1521:sandb","scott","tiger");
		
		CallableStatement cs= con.prepareCall("{call getBalance(?,?)}");

		cs.setInt(1, Integer.parseInt(s[0]));
		cs.registerOutParameter(2, Types.DOUBLE);

		cs.execute();

		System.out.println("Balance : "+ cs.getDouble(2));

		con.close();
	}//main
}//class
