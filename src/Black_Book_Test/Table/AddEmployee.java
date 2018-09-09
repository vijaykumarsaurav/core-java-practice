package Black_Book.Table;

import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */
public class AddEmployee {
public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName( 
	"oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","system");
		p.put("password","tiger");

		Connection con=d.connect(
			"jdbc:oracle:thin:@mysys:1521:thin",p);

Statement st=con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

ResultSet rs= st.executeQuery("select  * from mytable");

rs.moveToInsertRow();
rs.updateString(1,"JAMES");
rs.updateInt(2,20);
rs.updateInt(3,20);
rs.insertRow();
System.out.print("Employee Inserted");
con.close();
}//main
}//class
