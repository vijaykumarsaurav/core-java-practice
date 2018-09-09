package Black_Book.callablestatement;

import static Black_Book.Constent.DRIVER;
import static Black_Book.Constent.PASSWORD;
import static Black_Book.Constent.URL;
import static Black_Book.Constent.USERNAME;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */
public class CallableStatementEx4 {
public static void main(String s[]) throws Exception {

	Class.forName(DRIVER).newInstance();
	Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);

	CallableStatement cs= con.prepareCall("{call ?:=getAccountDetails(?)}");

		cs.registerOutParameter(1, Types.JAVA_OBJECT);

		cs.setInt(2,101);

		cs.execute();

		ResultSet rs=(ResultSet) cs.getObject(0);

		while (rs.next()){
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getDouble(3));
		}//while

		con.close();
	}//main
}//class
