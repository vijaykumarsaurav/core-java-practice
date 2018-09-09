package Black_Book.Resultset;
import static Black_Book.Constent.*;
import java.sql.*;
import java.util.*;
/**
 * @author Santosh
 */
public class AddEmployee {
public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName(DRIVER).newInstance());

		Properties p=new Properties ();
		p.put("user",USERNAME);
		p.put("password",PASSWORD);

		Connection con=d.connect(URL,p);

Statement st=con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

ResultSet rs= st.executeQuery("select COL1, COL2, COL3 from mytable");
rs.next();
System.out.println(rs.getString(1));

rs.moveToInsertRow();

rs.updateString(1,"Didh");
rs.updateString(2,"Bag");
rs.updateString(3,"Laptop");

rs.insertRow();

System.out.print("Employee Inserted");
con.close();
}//main
}//class
