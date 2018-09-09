package Databases.mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnTest {
	public static void main(String[] args) throws SQLException {
		System.out.println("check it.....");
		
		Connection c1 = DB.openConnecion();
		Connection c2 = DB.openConnecion();
		Connection c3 = DB.openConnecion();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
	}

}
