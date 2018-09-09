package Black_Book.callablestatement;
import static Black_Book.Constent.*;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */
public class CallableStatementEx3 {
public static void main(String s[]) throws Exception {

		Class.forName(DRIVER).newInstance();
		Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
	
		CallableStatement cs=con.prepareCall("{call ?:=getBalanceF(?)}");

		cs.registerOutParameter(1,Types.DOUBLE);
		cs.setInt(2,101);

		cs.execute();

		System.out.println("Balance : ==== : "+cs.getDouble(1));

		con.close();
	}//main
}//class
