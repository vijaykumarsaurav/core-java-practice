package Black_Book.callablestatement;
import static Black_Book.Constent.*;

import java.sql.*;
/**
 * @author Santosh
 */
public class CallableStatementEx2 {
public static void main(String s[]) throws Exception {

		Class.forName(DRIVER).newInstance();
		Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		CallableStatement cs= con.prepareCall("{call getBalance(?,?)}");

		cs.setInt(1, 101);
		cs.registerOutParameter(2, Types.DOUBLE);
		cs.execute();
		
//		if(cs.execute())
//		{
//			ResultSet rs= cs.getResultSet();
//			while(rs.next())
//				System.out.println(rs.getString(1));
//		}
		System.out.println("Balance : "+ cs.getDouble(2));

		con.close();
	}//main
}//class
