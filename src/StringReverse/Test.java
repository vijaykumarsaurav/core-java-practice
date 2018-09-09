package StringReverse;

class Oracle implements OsConnection
{
	public void getLoad()
	{
		System.out.println("Oracle Load Driver "+name);
	}
	public void getConnection()
	{
		
		System.out.println("Oracle connection ");
	}
	public void ocaleMethod()
	{
		
		System.out.println("Oracle method ");
	}
}
abstract class Mysql implements OsConnection
{
	public void getLoad()
	{
		System.out.println("Mysql Load Driver");
	}
	public void getConnection()
	{
		
		System.out.println("Mysql connection ");
	}
}
class SubMysql extends Mysql
{
	public void getLoad()
	{
		System.out.println("submysql method");
	}
	public void getConnection()
	{
		
		System.out.println("subMysql connection ");
	}
	@Override
	public void ocaleMethod() {

		System.out.println("subMysql interface mehtod ");
// TODO Auto-generated method stub
		
	}
	
}
public class Test {

	public static void main(String[] args)
	{
		
		OsConnection os = new Oracle();
		os.getLoad();
		os.getConnection();
		os.ocaleMethod();
		OsConnection os1 = new SubMysql();
		os1.getLoad();
		os1.getConnection();
		os1.ocaleMethod();
		Mysql m = new SubMysql();
		m.getConnection();
		m.getLoad();
	}

}
