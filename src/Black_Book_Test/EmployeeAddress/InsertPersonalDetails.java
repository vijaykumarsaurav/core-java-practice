//Inserting a record with Object type column using PreparedStatement
package Black_Book_Test.EmployeeAddress;

import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class InsertPersonalDetails {

public static void main(String s[]) throws Exception {


		Driver d= (Driver) ( Class.forName( 
	"oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","vijay");
		p.put("password","kumar");

		Connection con=d.connect(
			"jdbc:oracle:thin:@localhost:1521:xe",p);


		PreparedStatement ps= con.prepareStatement(
"insert into personaldetails(empno,photo,permanent_address) values(?,?,?)");

//Here we consider Present Address is same as Permanent Address, so we want to insert null in place of Present Address

		ps.setInt(1,8000);
		File f=new File("../Core_Java/src/Black_Book_Test/EmployeeAddress/MyImage.gif");
		FileInputStream fis= new FileInputStream(f);
		ps.setBinaryStream(2,fis, (int)f.length());

		EmployeeAddress addr=new EmployeeAddress();
		addr.setFlatno(500);
		addr.setCity("bangalore");
		addr.setStreet("karnatka");
		addr.setPin(560040);
		addr.setState("ka");
		addr.setTypeName("EMPADDRESS");

		ps.setObject(3,addr);

		int i=ps.executeUpdate();
		System.out.println("Personal Details of employee 7934 inserted successfully");
		con.close();
	}//main
}//class
