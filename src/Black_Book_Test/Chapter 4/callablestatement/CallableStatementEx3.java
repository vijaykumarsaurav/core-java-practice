package com.santosh.jdbc;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */
public class CallableStatementEx3 {
public static void main(String s[]) throws Exception {

		Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");

		oracle.jdbc.driver.OracleDriver od=new oracle.jdbc.driver.OracleDriver();
		Connection con=od.connect("jdbc:oracle:thin:@mysys:1521:sandb",p);

		CallableStatement cs=con.prepareCall("{call ?:=getBalanceF(?)}");

		cs.registerOutParameter(1,Types.DOUBLE);
		cs.setInt(2,Integer.parseInt(s[0]));

		cs.execute();

		System.out.println(cs.getDouble(1));

		con.close();
	}//main
}//class
