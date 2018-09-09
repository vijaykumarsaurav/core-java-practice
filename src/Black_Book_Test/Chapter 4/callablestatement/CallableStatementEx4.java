package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */
public class CallableStatementEx4 {
public static void main(String s[]) throws Exception {

		Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");

		oracle.jdbc.driver.OracleDriver od=new oracle.jdbc.driver.OracleDriver();
		Connection con=od.connect("jdbc:oracle:thin:@mysys:1521:sandb",p);

		CallableStatement cs= con.prepareCall("{call ?:=getAccountDetails(?)}");

		cs.registerOutParameter(1, oracle.jdbc.driver.OracleTypes.CURSOR);

		cs.setInt(2,Integer.parseInt(s[0]));

		cs.execute();

		ResultSet rs=(ResultSet) cs.getObject(1);

		while (rs.next()){
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getDouble(3));
		}//while

		con.close();
	}//main
}//class
