package SingletonConnection;

import java.sql.Connection;
import java.sql.SQLException;

import static SingletonConnection.DB.*;

public class UseDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=DB.openConnection();

		Connection con1=DB.openConnection();
		System.out.println(con.hashCode());
		
		System.out.println(con1.hashCode());
		
		Connection con2=DB.openConnection();
		System.out.println(con2.hashCode());
		
	}
	

}
