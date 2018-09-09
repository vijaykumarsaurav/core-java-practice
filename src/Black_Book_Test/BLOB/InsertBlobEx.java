package Black_Book_Test.BLOB;



import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Santosh
 */
public class InsertBlobEx {
public static void main(String s[]) throws Exception {

		Driver d= (Driver) ( Class.forName( 
	"oracle.jdbc.driver.OracleDriver").newInstance());

		Properties p=new Properties ();
		p.put("user","scott");
		p.put("password","tiger");

		Connection con=d.connect(
			"jdbc:oracle:thin:@mysys:1521:sandb",p);

		PreparedStatement ps= con.prepareStatement(
"insert into personaldetails(empno,photo) values(?,?)");

		ps.setInt(1,Integer.parseInt(s[0]));
		File f=new File("MyImage.jpg");
		FileInputStream fis= new FileInputStream(f);
		ps.setBinaryStream(2,fis, (int)f.length());
		int i=ps.executeUpdate();
		System.out.println("Record inserted successfully , count : "+i);
con.close();
}//main
}//class
