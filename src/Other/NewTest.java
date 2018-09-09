package Other;

public class NewTest 

{

	
	public static void main(String str[])
	{
		Class2 obj = new Class2("vijay");
		obj.display();
		obj.showData();
	}
	
}


class Class2 implements InterfaceTest
{
	private String val;
	public  Class2(String s)
	{
		this.val = s;
		
	}
	void display()
	{
		System.out.println("This is after all test : "+this.val);
	}
	
	public void  showData()
	{
		
		System.out.print(vali); 
	}
}

interface InterfaceTest
{
		public String vali= "Interface data";
		public void showData();
		 
}

